package com.punto17;

public class Television extends Electrodomestico{

    private double resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int precioBase, String color, String consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean verificarSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        if(this.resolucion >  40)
            this.precioBase = this.precioBase + (this.precioBase * 0.3);
        if (this.sintonizadorTDT)
            this.precioBase = this.precioBase + 50;

        return this.precioBase;
    }

}
