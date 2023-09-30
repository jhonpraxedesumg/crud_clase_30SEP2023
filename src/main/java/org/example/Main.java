package org.example;

import org.example.conexion.ConexionDb;
import org.example.entidades.catalogoDTO;
import org.example.servicios.CatalogoService;

import java.sql.Connection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
public static void catalogo() {

    Connection conexion = ConexionDb.obtenerConexion();

    if (conexion != null){
        System.out.println("conexion realizada con exito");
        catalogoDTO NuevoCat= new catalogoDTO();
        NuevoCat.setNombre("llantas");
        boolean insertado= CatalogoService.insertarCatalogo(NuevoCat);
        System.out.println("creo que se inserto bien");

    }
    else{
        System.out.println("error de conexion");
    }
}
    public static void main(String[] args) {


    }
    }