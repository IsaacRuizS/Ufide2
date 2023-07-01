package com.sc303.casoprogramado1;

public class Materias {
    private int idMateria;
    private String nombre;
    private String tipo;
    
    public Materias() {
    }

    public Materias(int idMateria, String nombre, String tipo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
