package org.example.servicios;

import org.example.DAO.catalogoDAO;
import org.example.entidades.catalogoDTO;

import java.sql.Connection;

public class CatalogoService {
    private catalogoDAO catalogoDao;
    public CatalogoService(Connection conexion){
        this.catalogoDao= new catalogoDAO(conexion);
    }
    public boolean insertarCatalogo(catalogoDTO catalogo){
        return catalogoDAO.insertarCatalogo(catalogo);
    }
}
