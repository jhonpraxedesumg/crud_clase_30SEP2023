package org.example.entidades;

public class catalogoDTO {
    private int id;
    private String nombre;

    public catalogoDTO() {
    }

    public catalogoDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "catalogoDTO: "+ this.id+"nombre: "+ this.nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
