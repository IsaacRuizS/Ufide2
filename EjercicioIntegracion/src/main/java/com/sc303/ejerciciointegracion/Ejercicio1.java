package com.sc303.ejerciciointegracion;

import static com.sc303.ejerciciointegracion.EjercicioIntegracion.Menu;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    public static void Ejercicio1(){
        try {
            int[] vectorEjercicio1 = new int[10];

            for(int i = 0; i<vectorEjercicio1.length; i ++){
                int pos = i+1;
                String mensaje  ="Ingrese el numero a almacenar dentro del vector en la posicion:  " + pos;
                vectorEjercicio1[i] = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            }

            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a leer"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero a leer"));
            String mensajeEncontrado = "";
            for(int i = 0; i<vectorEjercicio1.length; i ++){
                int pos = i+1;
                if(num1 == vectorEjercicio1[i]){
                    mensajeEncontrado += "El numero "+num1+" Fue encontrado en la posicion " + pos + " del vector. \n";
                }else if(num2 == vectorEjercicio1[i]){
                    mensajeEncontrado += "El numero "+num2+" Fue encontrado en la posicion " + pos + " del vector. \n";
                }
            }
            if("".equals(mensajeEncontrado)){
                JOptionPane.showMessageDialog(null, "No se encontro ninguno de los numeros buscados");
               EjercicioIntegracion.Menu();
            }else{
                JOptionPane.showMessageDialog(null, mensajeEncontrado);
               EjercicioIntegracion.Menu();
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Valores Invalidos intenta de nuevo");
             EjercicioIntegracion.Menu();
        }
    }
    
}

