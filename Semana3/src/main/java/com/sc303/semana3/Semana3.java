package com.sc303.semana3;

import javax.swing.JOptionPane;

public class Semana3 {

    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
        //ejercicio3()        
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        
    }
    
    public static void ejercicio1(){
        String simbolo = "@@@@@@@@@@";
        for (int i = 0; i <= 4; i++) {
            System.out.println(simbolo);
        }
    }
    
    
    public static void ejercicio3(){
        int largoTriangulo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el largo del triangulo"));
        String triangulo="";

        for(int index=1; index <= largoTriangulo; index++){
            for(int indexFila = 1; indexFila<=index; indexFila++){
                triangulo += "*";
            }
            triangulo += "\n";
        }
        JOptionPane.showMessageDialog(null, triangulo);
    }
    
    public static void ejercicio4(){  
        String textoEjemplo = "";
        for(int index=20; index<=30; index++){
            int indexAlCuadrado = index*index;
            textoEjemplo += "Posicion: "+index+"^"+"2= "+indexAlCuadrado+"\n";
        }
        
        JOptionPane.showMessageDialog(null,textoEjemplo);

    }
    
    public static void ejercicio5(){ 
        int cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de estudiantes"));
        double notaObtenida=0;
        double promedio = 0;
        double notaMayor=0;
        double notaMenor=100;
        double aprobados=0;        
        double sumaNotas=0;

        for(int index = 1; index <= cantidadEstudiantes; index++){
          notaObtenida = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante"+index));
           sumaNotas+=notaObtenida;
           if(notaObtenida>notaMayor){
               notaMayor = notaObtenida;
           }
           if(notaObtenida<notaMenor){
               notaMenor = notaObtenida;
           }
           if(notaObtenida>=70){
               aprobados +=1;
           }
        }
        promedio=sumaNotas/cantidadEstudiantes;
        String texto="Promedio: "+promedio+"\n Nota Menor: "+notaMenor+"\n Nota Mayor: "+notaMayor+"\n Aprobados: "+aprobados;
        JOptionPane.showMessageDialog(null, texto);
    }
    public static void ejercicio6(){
        double notaObtenida=0;
        double promedio = 0;
        double notaMayor=0;
        double notaMenor=100;
        double aprobados=0;        
        double sumaNotas=0;
        int iteracion = 1;

        while(notaObtenida>=0){
            notaObtenida = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante"+iteracion));
            if(notaObtenida<=0){
                break;
            }
            sumaNotas+=notaObtenida;
            if(notaObtenida>notaMayor){
                notaMayor = notaObtenida;
            }
            if(notaObtenida<notaMenor){
                notaMenor = notaObtenida;
            }
            if(notaObtenida>=70){
               aprobados +=1;
            }
            iteracion+=1;
        }
       
        promedio=sumaNotas/iteracion;
        String texto="Promedio: "+promedio+"\n Nota Menor: "+notaMenor+"\n Nota Mayor: "+notaMayor+"\n Aprobados: "+aprobados;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
}
