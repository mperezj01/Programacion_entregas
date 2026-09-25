/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23.tema2;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio23Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unidades;
        float precio, totalCompra;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio=entrada.nextFloat();
        
        System.out.println("¿Cuantas unidades quiere llevarse? ");
        unidades=entrada.nextInt();
        
        totalCompra=precio*unidades;
        System.out.println("El precio total de su compra es de "+totalCompra+" euros.");
        // TODO code application logic here
    }
    
}
