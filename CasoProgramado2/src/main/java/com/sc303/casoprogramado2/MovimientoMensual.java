package com.sc303.casoprogramado2;

public class MovimientoMensual {
    private char movimineto;
    private double monto;
    
    public MovimientoMensual() {
    
    }
    
    public MovimientoMensual(char movimineto, double monto) {
        this.movimineto = movimineto;
        this.monto = monto;
    }
    
    public char getMovimineto() {
        return movimineto;
    }

    public void setMovimineto(char movimineto) {
        this.movimineto = movimineto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    
    
    
}
