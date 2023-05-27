package com.sc303.semana2;

import javax.swing.JOptionPane;

public class Semana2 {

    public static void main(String[] args) {
        //ejercicio1();
        presentacion2();
    }
    
    public static void presentacion2(){
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese  la edad"));
        if(edad>=18){
            JOptionPane.showMessageDialog(null, "Usted puede votar");
        }else{
            JOptionPane.showMessageDialog(null, "Usted puede NO votar");
        }

        
    }
    
    public static void ejercicio1(){
        //sume y promedie 4 nuemros 
        int sumaTotal = 0;
        double promedioTotal = 0;
        /*int n1 = 25;
        int n2 = 10;
        int n3 = 40;
        int n4 = 12;
        
        sumaTotal = n1+n2+n3+n4;
        promedioTotal = sumaTotal/4.0;*/
        for (int index = 0; index < 4; index++) {
            int showIndex = index+1;
            int numeroASumar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a suma en la posicion "+showIndex));
            sumaTotal = sumaTotal + numeroASumar;
            promedioTotal = sumaTotal/4.0;
            
        }
        JOptionPane.showMessageDialog(null, "Suma = " + sumaTotal+ "\n El promedio total = "+promedioTotal);
    }
}
