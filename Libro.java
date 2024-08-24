/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAM
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no esta disponible para prestamo.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro ha sido devuelto.");
    }

    public void consultar_disponibilidad() {
        if (disponible) {
            System.out.println("El libro esta disponible para prestamo.");
        } else {
            System.out.println("El libro no esta disponible para prestamo.");
        }
    }
}

