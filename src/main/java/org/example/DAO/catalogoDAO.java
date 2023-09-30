package org.example.DAO;

import org.example.entidades.catalogoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class catalogoDAO {
    private Connection conexion;
    public catalogoDAO (Connection conexion){
        this.conexion=conexion;
    }
    public boolean insertarCatalogo(catalogoDTO catalogo){
        String consulta = "insert catalogo (nombre)values(?)";
        try (PreparedStatement statement= conexion.prepareStatement(consulta)){
            statement.setString(1,catalogo.getNombre());
            int filasAfectadas=statement.executeUpdate();
            return filasAfectadas>0;
        }
        catch (SQLException ex){
            System.out.println("error de conecion"+ex.getMessage());
        return false;
        }
    }
}
