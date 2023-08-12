package com.sc303.casoprogramado2;

import javax.swing.JOptionPane;

public class CasoProgramado2 {

    public static void main(String[] args) {
        MovimientoMensual[][] cuentaBancaria = new MovimientoMensual[2][3];
        menu(cuentaBancaria);
    }
    
    public static void menu(MovimientoMensual[][] cuentaBancaria){
         String mensajeMenu="Selecciona la accion a realizar:  \n"
                   + "1. Llenar Matriz \n"
                   + "2. Imprimir Matriz  \n"
                   + "3. Calcular estado de cuenta final \n";
         
         int opc = Integer.parseInt(JOptionPane.showInputDialog(mensajeMenu));
         
         switch (opc) {
            case 1:
                llenarMatriz(cuentaBancaria);
                break;
            case 2:
                Operaciones.mostrarOperaciones(cuentaBancaria);
                break;
            case 3:
                Operaciones.mostrarEstadoDeCuenta(cuentaBancaria);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingresaste una opcion incorrecta.");
                menu(cuentaBancaria);
        }
         
    }
    
   public static void llenarMatriz(MovimientoMensual[][] cuentaBancaria){
       for(int i = 0; i<cuentaBancaria.length; i++){
           for(int j = 0; j<cuentaBancaria[i].length; j++){
                if(cuentaBancaria[i][j] == null){
                    String transaccionMsg = "Ingresa el tipo de transaccion\n"
                     + "D. Desposito\n"
                     + "R. Retiro\n";

                    char tipoTransaccion = JOptionPane.showInputDialog(transaccionMsg).charAt(0);

                    if(tipoTransaccion == 'D' || tipoTransaccion == 'R'){
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto: "));
                        //intanciar el objeto
                        MovimientoMensual moviminetoNuevo = new MovimientoMensual();
                        //setear los valores
                        moviminetoNuevo.setMovimineto(tipoTransaccion);
                        moviminetoNuevo.setMonto(monto);
                        //almnacenar el objeto dentro de la matriz 
                        cuentaBancaria[i][j] = moviminetoNuevo;
                        JOptionPane.showMessageDialog(null, "Movimineto registrado correctamente!" + "Posicion: "+ i + j);

                    }else{
                        JOptionPane.showMessageDialog(null, "Ingresaste una opcion incorrecta.\n Revisa que sea D o R");
                        llenarMatriz(cuentaBancaria);
                    }
               }
           }
       }
    JOptionPane.showMessageDialog(null, "Matriz Llena");
    menu(cuentaBancaria);
   };
    

    
}
