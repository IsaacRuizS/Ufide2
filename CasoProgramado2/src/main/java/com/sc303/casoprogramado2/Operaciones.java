package com.sc303.casoprogramado2;

import javax.swing.JOptionPane;

public class Operaciones {
    
    public static void mostrarOperaciones(MovimientoMensual[][] cuentaBancaria){
        String mostrarMovimineto = "";
        for(int i = 0; i<cuentaBancaria.length; i++){
           for(int j = 0; j<cuentaBancaria[i].length; j++){
               mostrarMovimineto+= "Fila: " + i + " Columna: " + j + "\n";
               mostrarMovimineto+= "Tipo Movimineto: "+ cuentaBancaria[i][j].getMovimineto() + "\n";
               mostrarMovimineto+= "Monto: " + cuentaBancaria[i][j].getMonto() + "\n";
               mostrarMovimineto+= "-------------------------------------------------\n";
           }           
        }
        JOptionPane.showMessageDialog(null, mostrarMovimineto);
        CasoProgramado2.menu(cuentaBancaria);
    }
    
    public static void mostrarEstadoDeCuenta(MovimientoMensual[][] cuentaBancaria){
        String mostrarEstados = "";
        double montoInicial = 500000;
        for(int i = 0; i<cuentaBancaria.length; i++){
            for(int j = 0; j<cuentaBancaria[i].length; j++){
                if(cuentaBancaria[i][j].getMovimineto() == 'D' ){
                    double nuevoMonto = montoInicial + cuentaBancaria[i][j].getMonto();
                    mostrarEstados+= "A " + montoInicial + "se acreditada un monto de " + cuentaBancaria[i][j].getMonto() + "->" +"Resultado" + nuevoMonto+ "\n"; 
                    montoInicial = nuevoMonto;
                }else{
                    double nuevoMonto  = montoInicial - cuentaBancaria[i][j].getMonto();
                    mostrarEstados+= "A " + montoInicial + "se debitada un monto de " + cuentaBancaria[i][j].getMonto() + "->" +"Resultado" + nuevoMonto+ "\n"; 
                    montoInicial = nuevoMonto;
                }
                mostrarEstados+="------------------------------------\n";
            }   
        }
        JOptionPane.showMessageDialog(null, mostrarEstados);
        CasoProgramado2.menu(cuentaBancaria);
    }
}
