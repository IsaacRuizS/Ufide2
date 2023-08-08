
package com.mycompany.colegiado2;

import javax.swing.JOptionPane;

public class Colegiado2 {

    public static void main(String[] args) {
        Cancion[] cancionesArray = new Cancion[1000];
        //asignar valores
        cancionesArray = setCanciones(cancionesArray);
        //mostrar desde el main con get
        getCanciones(cancionesArray);
        //Canciones anteriores al año actual.
        Cancion.anioAnterior(cancionesArray);
        //Canciones del año actual.
        Cancion.anioActual(cancionesArray);
        //Canciones posteriores al año actual
        Cancion.anioPosterior(cancionesArray);
        //Canción de mayor duración
        Cancion.cancionMayorDuracion(cancionesArray);
        //Autor de la canción que está en la primera posición
        Cancion.primeraCancion(cancionesArray);
        //Mostrar todas las canciones desde cancion
        Cancion.mostrarCanciones(cancionesArray);
    }
    
    public static Cancion[] setCanciones(Cancion[] cancionesArray){
        Cancion cancionLaBachata = new Cancion();
        Cancion cancionNuevaVida = new Cancion(2,"Nueva Vida", "Peso Pluma", 3.75,2023);
        Cancion cancionCorazonRoto = new Cancion(3,"Corazon Roto", "Pablo E Chill", 2.50,2023);
        Cancion cancionPopular = new Cancion(4,"Popular", "Jhayco", 3.50,2018);
        Cancion cancionDeseos = new Cancion(5,"Deseos", "Jhayco", 3.50,2018);
        Cancion cancionAmorBipolar = new Cancion(6,"Amor Bipolar", "Duki", 3.50,2022);
        
        cancionesArray[0]=cancionLaBachata;
        cancionesArray[1]=cancionNuevaVida;
        cancionesArray[2]=cancionCorazonRoto;
        cancionesArray[3]=cancionPopular;
        cancionesArray[4]=cancionDeseos;
        cancionesArray[5]=cancionAmorBipolar;
        
        Cancion cancionCelosa = new Cancion();
        Cancion cancionRosaNegra = new Cancion();
        Cancion cancionAntes = new Cancion();
        Cancion cancionSeLeVe = new Cancion();
                
        cancionLaBachata.setIdCancion(1);
        cancionLaBachata.setTítulo("La bachata");
        cancionLaBachata.setAutor("Manuel Turizo");
        cancionLaBachata.setDuración(2.80);
        cancionLaBachata.setAnioCreacion(2021);
        
        cancionCelosa.setIdCancion(7);
        cancionCelosa.setTítulo("Celosa");
        cancionCelosa.setAutor("Duki");
        cancionCelosa.setDuración(2.80);
        cancionCelosa.setAnioCreacion(2022);
        
        cancionAntes.setIdCancion(8);
        cancionAntes.setTítulo("Antes de Perderte");
        cancionAntes.setAutor("Duki");
        cancionAntes.setDuración(4.80);
        cancionAntes.setAnioCreacion(2022);
        
        cancionRosaNegra.setIdCancion(9);
        cancionRosaNegra.setTítulo("Rosa negra");
        cancionRosaNegra.setAutor("Alex Rose");
        cancionRosaNegra.setDuración(3.80);
        cancionRosaNegra.setAnioCreacion(2022);
        
        cancionSeLeVe.setIdCancion(10);
        cancionSeLeVe.setTítulo("Se le ve");
        cancionSeLeVe.setAutor("Alex Rose");
        cancionSeLeVe.setDuración(2.80);
        cancionSeLeVe.setAnioCreacion(2022);
        
        cancionesArray[6]=cancionCelosa;
        cancionesArray[7]=cancionRosaNegra;
        cancionesArray[8]=cancionAntes;
        cancionesArray[9]=cancionSeLeVe;
        return cancionesArray;
    }
    
    public static void getCanciones(Cancion[] cancionesArray){
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
}
