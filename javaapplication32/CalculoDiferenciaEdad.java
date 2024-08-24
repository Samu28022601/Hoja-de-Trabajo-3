/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication32;
import java.util.Scanner;
/**
 *
 * @author SAM
 */
public class CalculoDiferenciaEdad {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el anio de nacimiento de la primera persona: ");
        int ano1 = scanner.nextInt();

        System.out.print("Ingrese el ani de nacimiento de la segunda persona: ");
        int ano2 = scanner.nextInt();

        int diferencia = Math.abs(ano1 - ano2);

        if (ano1 < ano2) {
            System.out.println("La primera persona es mayor por " + diferencia + " anios.");
        } else if (ano1 > ano2) {
            System.out.println("La segunda persona es mayor por " + diferencia + " anios.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }
    } 
}
