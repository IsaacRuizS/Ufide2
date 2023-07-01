package com.sc303.casoprogramado1;

import javax.swing.JOptionPane;

public class CasoProgramado1 {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        try{
            String mensajeMenu = "1. Crear Estudiante\n";
            mensajeMenu += "2. Crear Profesor\n";
            mensajeMenu += "3. Crear Materia\n";
            mensajeMenu += "4. Crear Grupo\n";
            mensajeMenu += "5. Crear Matricula\n";
            mensajeMenu += "0. Salir";

            String option =JOptionPane.showInputDialog(mensajeMenu);

            if(option == null){
                JOptionPane.showMessageDialog(null, "Hasta Luego!");
            }else{
                int optionNumber = Integer.parseInt(option);
                if(optionNumber == 1 || optionNumber == 2 || optionNumber == 3 || optionNumber == 4 || optionNumber == 5 || optionNumber == 0){
                    switch (optionNumber) {
                        case 1:
                            crearEstudiante();
                            break;
                        case 2:
                            crearMateria();
                            break;
                        case 3:
                            crearProfesor();
                            break;
                        case 4:
                            crearGrupo();
                            break;
                        case 5:
                            crearMatricula();
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null, "Hasta Luego!");
                            break;
                        default:
                            break;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccionaste una opcion invalida, intenta de nuevo!");
                    menu();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Seleccionaste una opcion invalida, intenta de nuevo!");
            menu();
        }
    }
    
    public static void crearEstudiante(){
        Estudiantes estudiante1 = new Estudiantes();
        
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));
        
        estudiante1.setNombre(nombre);
        estudiante1.setEdad(edad);
        estudiante1.idEstudiante = 1;
        
        String mostrarEstudiante = "Id: " + estudiante1.idEstudiante + "\n";
        mostrarEstudiante += "Nombre: " + estudiante1.getNombre() + "\n";
        mostrarEstudiante += "Edad: " + estudiante1.getEdad() + "\n";
        
        if(estudiante1.getNombre() == "0"){
            crearEstudiante();
        }else{
            JOptionPane.showMessageDialog(null, mostrarEstudiante);
            menu();
        }
    }
    
    public static void crearMateria(){
        Materias materia1 = new Materias(1,"Progra","Ingenieria");
        String mostrarMateria = "Id: " + materia1.getIdMateria() + "\n";
        mostrarMateria += "Nombre: " + materia1.getNombre()+ "\n";
        mostrarMateria += "Tipo: " + materia1.getTipo()+ "\n";
        
        JOptionPane.showMessageDialog(null, mostrarMateria);
        menu();
    }
    
    public static void crearProfesor(){
        Profesores profesor1 = new Profesores();
        
        profesor1.setIdProfesor(1);
        profesor1.setNombre("Edwin");
        profesor1.setEdad(30);

        String mostrarProfesor = "Id: " + profesor1.getIdProfesor()+ "\n";
        mostrarProfesor += "Nombre: " + profesor1.getNombre()+ "\n";
        mostrarProfesor += "Edad: " + profesor1.getEdad()+ "\n";
        
        JOptionPane.showMessageDialog(null, mostrarProfesor);
        menu();

    }
    
    public static void crearGrupo(){
        Grupos grupo1 = new Grupos(1,"Grupo1",30);
        
        String mostrarGrupo = "Id: " + grupo1.getIdGrupo()+ "\n";
        mostrarGrupo += "Nombre: " + grupo1.getNombre()+ "\n";
        mostrarGrupo += "Cantidad de estudiantes: " + grupo1.getCantidadEstudiantes()+ "\n";

        JOptionPane.showMessageDialog(null, mostrarGrupo);
        menu();
    }
    
    public static void crearMatricula(){
        Matricula matricula1 = new Matricula(1,"Isaac", "Edwin");
        
        String mostrarMatricula = "Id: " + matricula1.getIdMatricula() + "\n";
        mostrarMatricula += "Nombre del estudiante: " + matricula1.getNombreEstudiante() + "\n";
        mostrarMatricula += "Nombre del profesor: " + matricula1.getNombreProfesor() + "\n";

        JOptionPane.showMessageDialog(null, mostrarMatricula);
        menu();
    }
}
