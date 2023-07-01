package com.sc303.casoprogramado1;

public class Grupos {
    private int idGrupo;
    private String nombre;
    private int cantidadEstudiantes;
    
    public Grupos() {
    
    }

    public Grupos(int idGrupo, String nombre, int cantidadEstudiantes) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
    
    
}
