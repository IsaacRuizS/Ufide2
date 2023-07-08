package com.sc303.semana8;

import javax.swing.JOptionPane;

public class Semana8 {

    public static void main(String[] args) {
        ejercicio1();

    }
    
    public static void ejercicio1(){
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el tamano del arreglo"));
        int[] arreglo = new int[tamano];
        arreglo = rellenarArreglo(arreglo);
        mostrarArreglo(arreglo);
        
    }
    
    public static int[] rellenarArreglo(int[] arreglo){
        for(int index = 0; index < arreglo.length; index++){
            arreglo[index] = index;
        }
        return arreglo;
    }
    public static void mostrarArreglo(int[] arreglo){
         for(int index = 0; index < arreglo.length; index++){
            System.out.println( arreglo[index]);
        }
    }
}
