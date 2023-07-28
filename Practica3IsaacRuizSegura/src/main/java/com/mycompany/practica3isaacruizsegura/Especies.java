package com.mycompany.practica3isaacruizsegura;

public class Especies {
    
    private String nombreEspecie;
    private int cantidad;
    private String categoría;
    private double precio;

    public Especies() {
        
    }

    public Especies(String nombreEspecie, int cantidad, String categoría, double precio) {
        this.nombreEspecie = nombreEspecie;
        this.cantidad = cantidad;
        this.categoría = categoría;
        this.precio = precio;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    
}
