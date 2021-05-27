package com.punto4;

import java.util.Scanner;

public class Main {

    public static final double IVA = 0.21;

    public static void main(String[] args) {

        Producto producto = new Producto();
        Scanner s = new Scanner(System.in);

        System.out.print("Digite el precio del producto: ");
        double precio = s.nextDouble();
        producto.calcularPrecio(precio);

    }

}
