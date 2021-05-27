package com.punto17;

public class Lavadora extends Electrodomestico{

    public static final double CARGA = 5;

    private double carga = CARGA;

    public Lavadora() {
    }

    public Lavadora(int precioBase, int peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(int precioBase, String color, String consumoEnergetico, int peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public double precioFinal(){

        if(carga > 30)
            this.precioBase = this.precioBase + 50;
        return precioBase;
    }

}
