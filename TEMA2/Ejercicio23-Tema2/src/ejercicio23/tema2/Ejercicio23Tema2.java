/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23.tema2;
import java.util.Scanner;//Importo Scanner del paquete java.util

/**
 *
 * @author hate_
 */
public class Ejercicio23Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unidades;//Declaro la variable unidades como número entero
        float precio, totalCompra;//Declaro las variables precio y totalCompra como float
        
        Scanner entrada = new Scanner(System.in);//Añado la variable de entrada que me va a pedir la consola con el Sout
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");//Pido el precio
        precio=entrada.nextFloat();//Asigno el valor de entrada a la variable precio
        
        System.out.println("¿Cuantas unidades quiere llevarse? ");//Pido el número de unidades
        unidades=entrada.nextInt();//Asigno el valor de entrada a la variable unidades
        
        totalCompra=precio*unidades;//Asigno el producto de las variables precio y unidades a la variable totalCompra
        System.out.println("El precio total de su compra es de "+totalCompra+" euros.");//Imprimo en pantalla el resultado
        // TODO code application logic here
    }
    
}
