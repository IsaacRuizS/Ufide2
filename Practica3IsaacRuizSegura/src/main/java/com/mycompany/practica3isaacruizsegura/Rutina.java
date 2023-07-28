package com.mycompany.practica3isaacruizsegura;

import javax.swing.JOptionPane;

public class Rutina {
    private Especies[] especies;

    public Rutina() {
        this.especies = new Especies[10];
    }

    public Especies[] getEspecies() {
        return especies;
    }

    public void setEspecies(Especies especies) {
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] == null) {
                this.especies[i] = especies;
                break;
            }
        }
    }
    
    public void consultaEspecie(){
        //mostrar opciones
        String[] nombreEspecies = new String[this.especies.length];
        for(int i = 0; i < this.especies.length; i++){
            if (this.especies[i] != null){
                nombreEspecies[i] = this.especies[i].getNombreEspecie();
            }
        }
        String especie = (String) JOptionPane.showInputDialog(null, "Selecciona la especie:",
        "Menú desplegable", JOptionPane.QUESTION_MESSAGE, null, nombreEspecies, nombreEspecies[0]);
        //filtrar
        String especiesDisponibles = "";
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] != null && this.especies[i].getNombreEspecie().equalsIgnoreCase(especie)) {
                especiesDisponibles += "Nombre: "+this.especies[i].getNombreEspecie()+ "\n Categoria: "+ this.especies[i].getCategoría()+ "\n Cantidad: "+ this.especies[i].getCantidad()+ "\n Precio: "+ this.especies[i].getPrecio()+ "\n\n";
            }
        }
        if(especiesDisponibles == ""){
            JOptionPane.showMessageDialog(null, "No se encontro ninguna especie");
        }else{
            JOptionPane.showMessageDialog(null, especiesDisponibles);
        }
    }
    
    public void consultaCategoria(){
        //mostrar las opciones
        String[] categorias = { "Tropical", "Oriental"};
        String categoria = (String) JOptionPane.showInputDialog(null, "Selecciona la categoria:",
        "Menú desplegable", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
                
        //filtrar 
        String categoriasDisponibles = "";
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] != null && this.especies[i].getCategoría().equalsIgnoreCase(categoria)) {
                categoriasDisponibles += "Nombre: "+this.especies[i].getNombreEspecie()+ "\n Categoria: "+ this.especies[i].getCategoría()+ "\n Cantidad: "+ this.especies[i].getCantidad()+ "\n Precio: "+ this.especies[i].getPrecio()+ "\n\n";
            }
        }
        if(categoriasDisponibles == ""){
            JOptionPane.showMessageDialog(null, "No se encontro ninguna categoria"); 
        }else{
            JOptionPane.showMessageDialog(null, categoriasDisponibles); 
        }
    }
    
    public void consultaPrecioMayor(){
        double precioMayor = 0;
        String precioMayorMsg = "";
        //filtro
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] != null && this.especies[i].getPrecio() > precioMayor) {
                precioMayor = this.especies[i].getPrecio();
            }
        }
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] != null && this.especies[i].getPrecio() == precioMayor) {
                precioMayorMsg += "Nombre: "+this.especies[i].getNombreEspecie()+ "\n Categoria: "+ this.especies[i].getCategoría()+ "\n Cantidad: "+ this.especies[i].getCantidad()+ "\n Precio: "+ this.especies[i].getPrecio()+ "\n\n";
            }
        }
        if(precioMayorMsg == ""){
            JOptionPane.showMessageDialog(null, "No se encontro"); 
        }else{
            JOptionPane.showMessageDialog(null, precioMayorMsg); 
        }
    }
    
    public void consultaPrecioMenor(){
        double precioMenor = 1000000000;
        String precioMenorMsg = "";
        //filtro
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] != null && this.especies[i].getPrecio() < precioMenor) {
                precioMenor = this.especies[i].getPrecio();
            }
        }
        for (int i = 0; i < this.especies.length; i++) {
            if (this.especies[i] != null && this.especies[i].getPrecio() == precioMenor) {
                precioMenorMsg += "Nombre: "+this.especies[i].getNombreEspecie()+ "\n Categoria: "+ this.especies[i].getCategoría()+ "\n Cantidad: "+ this.especies[i].getCantidad()+ "\n Precio: "+ this.especies[i].getPrecio()+ "\n\n";
            }
        }
        if(precioMenorMsg == ""){
            JOptionPane.showMessageDialog(null, "No se encontro"); 
        }else{
            JOptionPane.showMessageDialog(null, precioMenorMsg); 
        }
    }
    
    
}
