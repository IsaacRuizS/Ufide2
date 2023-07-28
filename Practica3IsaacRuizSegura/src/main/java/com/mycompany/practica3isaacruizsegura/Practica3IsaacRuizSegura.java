package com.mycompany.practica3isaacruizsegura;

import javax.swing.JOptionPane;

public class Practica3IsaacRuizSegura {

    public static void main(String[] args) {
        Rutina rutina = new Rutina();
        //creacion de especies 
        Especies pez1 =  new Especies();
        pez1.setNombreEspecie("Pez globo");        
        pez1.setCategoría("Tropical");
        pez1.setCantidad(10);
        pez1.setPrecio(10000);
        Especies pez2 =  new Especies("Pez espada",30,"Oriental",13000);    
        //asginar los objetos al arreglo de rutina
        rutina.setEspecies(pez1);
        rutina.setEspecies(pez2);
        consultas(rutina);
    }
    
    public static void consultas(Rutina rutina){
        String consultasMenu = "Selecciona la consulta a realizar:\n"
                + "1.Consultar Especie \n "
                + "2.Consultar Categoria \n"
                + "3.Consultar Precio Mayor\n"
                + "4.Consultar Precio Menor\n "
                + "5.Salir";
        
        // Mostrar el menú desplegable y obtener la selección del usuario
        Integer[] opciones = { 1,2,3,4,5 };
        
        Integer opcionSeleccionada = (Integer) JOptionPane.showInputDialog(null, consultasMenu,
                "Menú desplegable", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        switch (opcionSeleccionada) {
            case 1:
                rutina.consultaEspecie();
                consultas(rutina);
                break;
                
            case 2:
                rutina.consultaCategoria();
                consultas(rutina);
                break;
                
            case 3:
                rutina.consultaPrecioMayor();
                consultas(rutina);
                break;
                
            case 4:
                rutina.consultaPrecioMenor();
                consultas(rutina);
                break;
                
             case 5:
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                break;
            default:
                consultas(rutina);
        }
    }
}
