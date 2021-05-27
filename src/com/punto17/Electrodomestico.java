package com.punto17;

public class Electrodomestico {

    private static final String [] ColoresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    private static final String COLORDEFECTO = "blanco";
    private static final String CONSUMOENERGETICO = "F";
    private static final double PRECIOBASE = 100;
    private static final int PESO = 5;
    private static double precioAuxiliar=0;

    protected double precioBase = PRECIOBASE;
    protected String color = COLORDEFECTO;
    protected String consumoEnergetico = CONSUMOENERGETICO;
    protected int peso = PESO;

    public Electrodomestico() {
        this.precioBase = PRECIOBASE;
        this.color = COLORDEFECTO;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.color = COLORDEFECTO;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.color = COLORDEFECTO;
    }

    public Electrodomestico(int precioBase, String color, String consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }


    public double consumoEnergetico(int posicion){
        int [] precio = {100, 80, 60, 50, 30, 10};
        return precio[posicion];
    }

    public boolean comprobarConsumoEnergetico(char letra){
        boolean existe = false;

        switch (letra){
            case 'A':
                precioAuxiliar=100;
                existe=true;
                break;
            case 'B':
                precioAuxiliar=80;
                existe=true;
                break;
            case 'C':
                precioAuxiliar=60;
                existe=true;
                break;
            case 'D':
                precioAuxiliar=50;
                existe=true;
                break;
            case 'E':
                precioAuxiliar=30;
                existe=true;
                break;
            case 'F':
                precioAuxiliar=10;
                existe=true;
                break;
            default:
                precioAuxiliar=0;
                existe=false;
                break;
        }
        return existe;
    }

    public static boolean comprobarColor(String color){
        boolean resultado = false;

        for (String colorDisponible : ColoresDisponibles) {
            if (colorDisponible.compareTo(color) == 0) {
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    public void precioFinalElectrodomestico(){

        double precioTotal = PRECIOBASE + precioAuxiliar;
        System.out.println("Precio Total Electrodomestico: "+precioTotal);
    }

}
