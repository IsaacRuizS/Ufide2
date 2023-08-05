package com.sc303.ejerciciointegracion;

import static com.sc303.ejerciciointegracion.EjercicioIntegracion.Menu;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    public static void Ejercicio2(){
        try{
            int[][] matrizEjercicio2 = new int[2][5];
            for(int i = 0; i<matrizEjercicio2.length; i++){
               for(int j = 0; j<matrizEjercicio2[i].length; j++){
                   int fila = i+1;
                   int col = j+1;
                   String mensaje  = "Ingrese el numero a almacenar dentro de la matriz en la Fila:  " + fila +" Columna: " + col + "\n";
                   matrizEjercicio2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
               }
            }
            int sumPositivos = 0;
            int sumNegativos = 0;
            String mostrarMatriz = "";

            for(int i = 0; i<matrizEjercicio2.length; i++){
                mostrarMatriz +="\n";
                for(int j = 0; j<matrizEjercicio2[i].length; j++){
                    mostrarMatriz += matrizEjercicio2[i][j];
                    if(j != matrizEjercicio2[i].length-1){
                        mostrarMatriz += ", ";
                    }
                    if(matrizEjercicio2[i][j] < 0){
                        sumNegativos += matrizEjercicio2[i][j];
                    }else{
                        sumPositivos += matrizEjercicio2[i][j];
                    }
                }
            }
            JOptionPane.showMessageDialog(null, mostrarMatriz);
            JOptionPane.showMessageDialog(null, "La sumatoria de los positivos es: " + sumPositivos);
            JOptionPane.showMessageDialog(null, "La sumatoria de los negativos es: " + sumNegativos);
            EjercicioIntegracion.Menu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valores Invalidos intenta de nuevo");
            EjercicioIntegracion.Menu();
        }
    }
    
}
