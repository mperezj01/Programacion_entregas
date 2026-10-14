/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27_tema3;
import java.util.Scanner;//Importamos el paquete del Scanner de java.util

/**
 *
 * @author alumno
 */
public class Ejercicio27_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, orden, resultado;//Declaro las variables como int
        
        Scanner entrada = new Scanner(System.in);//Inicio el scanner para pedir los números al usuario
        System.out.println("Por favor, introduzca un primer numero:");
        num1 = entrada.nextInt();//Declaro las variables en las que se guardará el número que introduzca el usuario
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        do{//Inicio el bucle para que el programa repita las instrucciones
            System.out.println("Decida la operacion que quiere realizar:");
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros.");
            System.out.println("3.- Multiplicar los numeros.");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            orden = entrada.nextInt();//Declaro la variable del siguiente scanner
            switch(orden){//Utilizo el condicional switch case para realizar las instrucciones según el número que introduzca el usuario
                case 1://Si introduce el 1 se realizará la suma
                    resultado=num1+num2;
                    System.out.println("El resultado de la suma es "+resultado);
                    break;
                case 2://Si introduce el 2 realizará la resta
                    resultado=num1-num2;
                    System.out.println("El resultado de la resta es "+resultado);
                    break;
                case 3://Si introduce el 3 realizará el producto
                    resultado=num1*num2;
                    System.out.println("El resultado del producto es "+resultado);
                    break;
                case 4://Si introduce el 4 realizará la división
                    try{//Añado el try-catch para que, en caso de error por dividir entre 0 si el segundo número es 0, no salte un error aritmético
                    resultado=num1/num2;
                    System.out.println("El resultado de la división es "+resultado);
                    }
                    catch(ArithmeticException e){
                        System.out.println("Error: "+e.getMessage());
                    }break;
            }
        }while(orden!=5);//El bucle se repetirá hasta que el número introducido sea distinto de 5 y, en este caso, saldremos del programa
        System.out.println("Saliendo del programa");
        
        // TODO code application logic here
    }
    
}
