package org.example.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDb {
    private static final String URL = "jdbc:mysql://localhost:3306/dbventas"; // Cambiar la URL de la base de datos según tu configuración
    private static final String USUARIO = "root"; // Cambiar al nombre de usuario de tu base de datos
    private static final String CONTRASEÑA = ""; // Cambiar a la contraseña de tu base de datos

    private static Connection conexion = null;

    public static Connection obtenerConexion() {
        if (conexion == null) {
            try {
                // Cargar el controlador JDBC para MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establecer la conexión con la base de datos
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("Error al cargar el controlador JDBC.");
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error al establecer la conexión con la base de datos.");
            }
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error al cerrar la conexión con la base de datos.");
            }
        }
    }


    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error al cerrar la conexión con la base de datos.");
            }
        }
    }

}
