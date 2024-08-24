/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAM
 */
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract void agregar_cantidad(int cantidad);
    public abstract void vender(int cantidad);

    public void consultar_inventario() {
        System.out.println("Cantidad disponible de " + nombre + ": " + cantidad);
    }
}

