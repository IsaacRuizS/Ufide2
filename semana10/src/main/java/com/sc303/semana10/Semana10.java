package com.sc303.semana10;

import javax.swing.JOptionPane;

public class Semana10 {

    public static void main(String[] args) {
        int cantidadFilas= 3;
        int cantidadColumnas= 3;

        int matriz[][] = new int[cantidadFilas][cantidadColumnas];
        for(int i=0; i<cantidadFilas; i++){
            for(int j=0; j<cantidadColumnas; j++){
                matriz[i][j] =  (int)Math.random()*10+1;
            }    
        }
        int sumaEsquinas = matriz[0][0] + matriz[0][2] + matriz[2][0] + matriz[2][2];
        JOptionPane.showInputDialog(sumaEsquinas);
        int sumatoria = 0;
        for(int i=0; i<cantidadFilas; i++){
            for(int j=0; j<cantidadColumnas; j++){
               if(i == 0 && j == 0  || i == 0 && j == cantidadColumnas-1){
                   sumatoria += matriz[i][j];
               }
               if(i==cantidadFilas-1 && j==0 || i==cantidadFilas-1 && j==cantidadColumnas-1){
                    sumatoria += matriz[i][j];
               }
            }    
        }
        
    }
}
 