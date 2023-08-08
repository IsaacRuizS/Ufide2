package com.mycompany.colegiado2;

import javax.swing.JOptionPane;

public class Cancion {
    private int idCancion;
    private String título;
    private String autor;
    private double duración;
    private int anioCreacion;

    public Cancion() {
    }

    public Cancion(int idCancion, String título, String autor, double duración, int anioCreacion) {
        this.idCancion = idCancion;
        this.título = título;
        this.autor = autor;
        this.duración = duración;
        this.anioCreacion = anioCreacion;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCacion) {
        this.idCancion = idCacion;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuración() {
        return duración;
    }

    public void setDuración(double duración) {
        this.duración = duración;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
    
    public static void anioAnterior(Cancion[] cancionesArray){
        int anioActual = java.time.Year.now().getValue();
        String mostrarAnioAnterior = "";
         for (int i = 0; i < cancionesArray.length; i++) {
             if(cancionesArray[i] == null){
                break;
            }
             cancionesArray[i].getAnioCreacion();
             if(cancionesArray[i].getAnioCreacion() < anioActual){
                mostrarAnioAnterior += "ID: " + cancionesArray[i].getIdCancion() + "\n";
                mostrarAnioAnterior += "Título: " + cancionesArray[i].getTítulo() + "\n";
                mostrarAnioAnterior += "Autor: " + cancionesArray[i].getAutor() + "\n";
                mostrarAnioAnterior += "Duración: " + cancionesArray[i].getDuración() + "\n";
                mostrarAnioAnterior += "Año de Creación: " + cancionesArray[i].getAnioCreacion() + "\n";
                mostrarAnioAnterior += "\n";
             }
         }
         if(mostrarAnioAnterior != ""){
            JOptionPane.showMessageDialog(null, "Año anterior: \n"+mostrarAnioAnterior);
         }else{
            JOptionPane.showMessageDialog(null, "No hay canciones en este anio");
         }
    }
    
    public static void anioActual(Cancion[] cancionesArray){
        int anioActual = java.time.Year.now().getValue();
        String mostrarAnioActual = "";
         for (int i = 0; i < cancionesArray.length; i++) {
             if(cancionesArray[i] == null){
                break;
            }
             cancionesArray[i].getAnioCreacion();
             if(cancionesArray[i].getAnioCreacion() == anioActual){
                mostrarAnioActual += "ID: " + cancionesArray[i].getIdCancion() + "\n";
                mostrarAnioActual += "Título: " + cancionesArray[i].getTítulo() + "\n";
                mostrarAnioActual += "Autor: " + cancionesArray[i].getAutor() + "\n";
                mostrarAnioActual += "Duración: " + cancionesArray[i].getDuración() + "\n";
                mostrarAnioActual += "Año de Creación: " + cancionesArray[i].getAnioCreacion() + "\n";
                mostrarAnioActual += "\n";
             }
         }
        if(mostrarAnioActual != ""){
            JOptionPane.showMessageDialog(null, "Año actual: \n"+mostrarAnioActual);
        }else{
            JOptionPane.showMessageDialog(null, "No hay canciones en este anio");
        }
    }
    
    public static void anioPosterior(Cancion[] cancionesArray){
        int anioActual = java.time.Year.now().getValue();
        String mostrarAnioPosterior = "";
         for (int i = 0; i < cancionesArray.length; i++) {
             if(cancionesArray[i] == null){
                break;
            }
             cancionesArray[i].getAnioCreacion();
             if(cancionesArray[i].getAnioCreacion() > anioActual){
                mostrarAnioPosterior += "ID: " + cancionesArray[i].getIdCancion() + "\n";
                mostrarAnioPosterior += "Título: " + cancionesArray[i].getTítulo() + "\n";
                mostrarAnioPosterior += "Autor: " + cancionesArray[i].getAutor() + "\n";
                mostrarAnioPosterior += "Duración: " + cancionesArray[i].getDuración() + "\n";
                mostrarAnioPosterior += "Año de Creación: " + cancionesArray[i].getAnioCreacion() + "\n";
                mostrarAnioPosterior += "\n";
             }
         }
        if(mostrarAnioPosterior != ""){
            JOptionPane.showMessageDialog(null, "Año posterior: \n"+mostrarAnioPosterior);
        }else{
            JOptionPane.showMessageDialog(null, "No hay canciones en años posteriores");
        }
    }
    
     public static void cancionMayorDuracion(Cancion[] cancionesArray) {
        Cancion cancionMayorDuracion = cancionesArray[0];
        String mayorDuracion = "";
        for (int i = 1; i < cancionesArray.length; i++) {
            if(cancionesArray[i] == null){
                break;
            }
            if (cancionesArray[i].getDuración() > cancionMayorDuracion.getDuración()) {
                cancionMayorDuracion = cancionesArray[i];
            }
        }
         if(cancionMayorDuracion != null){
            mayorDuracion += "ID: " + cancionMayorDuracion.getIdCancion() + "\n";
            mayorDuracion += "Título: " + cancionMayorDuracion.getTítulo() + "\n";
            mayorDuracion += "Autor: " + cancionMayorDuracion.getAutor() + "\n";
            mayorDuracion += "Duración: " + cancionMayorDuracion.getDuración() + "\n";
            mayorDuracion += "Año de Creación: " + cancionMayorDuracion.getAnioCreacion() + "\n";
            mayorDuracion += "\n";
             
            JOptionPane.showMessageDialog(null, "Mayor Duracion: \n"+mayorDuracion);
        }else{
            JOptionPane.showMessageDialog(null, "Error, cancion no encontrada");
        }
    }
     
    public static void primeraCancion(Cancion[] cancionesArray) {
        JOptionPane.showMessageDialog(null,  "Primera Cancion: \n"+cancionesArray[0].getAutor());
    }
    
     public static void mostrarCanciones(Cancion[] cancionesArray){
        String detalles = "Detalles de Canciones:\n";
        for (int i = 0; i < cancionesArray.length; i++) {
            if(cancionesArray[i] == null){
                break;
            }
            detalles += "ID: " + cancionesArray[i].getIdCancion() + "\n";
            detalles += "Título: " + cancionesArray[i].getTítulo() + "\n";
            detalles += "Autor: " + cancionesArray[i].getAutor() + "\n";
            detalles += "Duración: " + cancionesArray[i].getDuración() + "\n";
            detalles += "Año de Creación: " + cancionesArray[i].getAnioCreacion() + "\n";
            detalles += "\n";
        }
        int largo = detalles.length();
        int dividir = largo / 2;
        
        String parte1 = detalles.substring(0, dividir);
        String parte2 = detalles.substring(dividir);
        
        JOptionPane.showMessageDialog(null, parte1, "Detalles de Canciones (Página 1)", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, parte2, "Detalles de Canciones (Página 2)", JOptionPane.INFORMATION_MESSAGE);
    }

     
    
    
    
    /*
    - Mostrar todas las canciones.
    */
    
    
}
