package com.sc303.casoprogramado1;

public class Matricula {
    private int idMatricula;
    private String nombreEstudiante;
    private String nombreProfesor;
    
    public Matricula() {
    }
    
    public Matricula(int idMatricula, String nombreEstudiante, String nombreProfesor) {
        this.idMatricula = idMatricula;
        this.nombreEstudiante = nombreEstudiante;
        this.nombreProfesor = nombreProfesor;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }



    

    
}
