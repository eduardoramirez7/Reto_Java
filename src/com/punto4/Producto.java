package com.punto4;

public class Producto {

    private static double IVA = 0.12;

    public void calcularPrecio(double precio){

        double precioIVA = precio * IVA;
        precio = precio + (precio * IVA);
        System.out.println("Total IVA: " + precioIVA);
        System.out.println("Precio + IVA: " + precio);
    }

}
