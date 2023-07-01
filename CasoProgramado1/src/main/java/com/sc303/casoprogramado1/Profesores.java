package com.sc303.casoprogramado1;

public class Profesores {
    private int idProfesor;
    private String nombre;
    private int edad;

    public Profesores() {
    }

    public Profesores(int idProfesor, String nombre, int edad) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
