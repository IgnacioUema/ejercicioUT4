/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javarefactorizacion;

/**
 *
 * @author Nacho
 */
public class Factura {

public static double calcularPrecioTotal(double precio, int cantidad) { 
double totalSinDescuento = precio * cantidad;
    return aplicarDescuento(totalSinDescuento, cantidad);
}

public static double aplicarDescuento(double totalSinDescuento, int cantidad){
    double calculoDescuento = totalSinDescuento;
    if (cantidad > 10) { calculoDescuento = totalSinDescuento - (totalSinDescuento * 0.1); 
} 
return calculoDescuento; 

} public static void imprimirFactura(String nombre, double precio, int cantidad, double total) { 

System.out.println("Cliente: " + nombre); 
System.out.println("Cantidad: " + cantidad);
System.out.println("Precio unitario: " + precio); 
System.out.println("Total a pagar: " + total);
}
 
public static void main(String[] args) {
    double precio = 15.5;
    int cantidad = 20;
    String nombre = "Juan";
    double total = calcularPrecioTotal( precio, cantidad);
    imprimirFactura(nombre, precio, cantidad, total); 
}
 }


/* Rama secundaria se vuelve el main */

