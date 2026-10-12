/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32.tema2;
import java.util.Scanner;//Importo la librería java.util en la que se encuentra Scanner

/**
 *
 * @author hate_
 */
public class Ejercicio32Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b50, b20, b10, b5, m2, m1, total, resto;//Declaro todas las variables como int, números enteros
        
        Scanner entrada = new Scanner(System.in);//Creo la entrada
        System.out.println("Por favor, indique una cantidad de dinero:");
        total = entrada.nextInt();//Asigno el valor de entrada a la variable total
        
        b50=total/50;//Asigno la cantidad de billetes de 50 dividiendo el número total entre 50, me dará un número entero
        resto=total%50;//Asigno lo que sobra de dividir el total entre 50 a la variable resto
        b20=resto/20;//Asigno la cantidad de billetes de 20 dividiendo el resto anterior entre 20
        resto=resto%20;//Vuelvo a asignar el sobrante de la operación anterior a resto
        b10=resto/10;//Asigno la cantidad de billetes de 10 a la variable b10 dividiendo el resto entre 10
        resto=resto%10;//Actualizo el resto con lo que me sobra de la división anterior
        b5=resto/5;//Asigno la cantidad de billetes de 5 dividiendo el resto entre 5
        resto=resto%5;//Actualizo el resto
        m2=resto/2;//Divido el resto entre 2 para obtener la cantidad de monedas de 2
        m1=resto%2;//Obtengo la cantidad de monedas de 1 con el sobrante de dividir el resto entre 2
        System.out.println(total+" euros hacen un total de "+b50+" billetes de 50, "+b20+" billetes de 20, "+b10+
                " billetes de 10, "+b5+" billetes de 5, "+m2+" monedas de 2 euros y "+m1+" monedas de 1 euro.");
        
        
        
        // TODO code application logic here
    }
    
}
