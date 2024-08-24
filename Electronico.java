/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAM
 */
public class Electronico extends Producto {

    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public void agregar_cantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println(cantidad + " unidades agregadas. Total: " + this.cantidad);
    }

    @Override
    public void vender(int cantidad) {
        if (cantidad > this.cantidad) {
            System.out.println("No hay suficiente inventario para realizar la venta.");
        } else {
            this.cantidad -= cantidad;
            System.out.println("Venta realizada. Total restante: " + this.cantidad);
        }
    }
}
