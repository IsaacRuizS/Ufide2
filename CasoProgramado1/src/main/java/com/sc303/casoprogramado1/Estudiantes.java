package com.sc303.casoprogramado1;

import javax.swing.JOptionPane;


public class Estudiantes {
    public int idEstudiante;
    private String nombre;
    private int edad;

    public Estudiantes() {
    }

    public Estudiantes(int idEstudiante, String nombre, int edad) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() == 0){
            JOptionPane.showMessageDialog(null, "No puedes tener valores en blanco");
            this.nombre = "0";
        }else{
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
