package com.sc303.ejerciciointegracion;

import javax.swing.JOptionPane;

public class EjercicioIntegracion {

    public static void main(String[] args) {
        Menu();
    }
    
    public static void Menu(){
        String mensajeMenu="Selecciona el ejercicio a realizar:  \n"
                   + "1. Ejercicio 1 \n"
                   + "2. Ejercicio 2  \n"
                   + "0. Salir \n";

        var opc = new Integer[]{0,1,2}; 

        Integer opcionSeleccionada = (Integer) JOptionPane.showInputDialog(null, mensajeMenu,
                 "Menú desplegable", JOptionPane.QUESTION_MESSAGE, null, opc, opc[1]);

        switch (opcionSeleccionada) {
            case 1:
                Ejercicio1.Ejercicio1();
                break;
            case 2:
                Ejercicio2.Ejercicio2();
                break;
            default:
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                break;   
        }
    }
}
