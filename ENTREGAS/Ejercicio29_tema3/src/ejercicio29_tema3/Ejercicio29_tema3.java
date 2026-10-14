/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29_tema3;
import java.util.Scanner;//Importo el scanner del paquete java.util

/**
 *
 * @author alumno
 */
public class Ejercicio29_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, intentos=0;//Declaro las variables como int
        double aleatorio=(int)Math.floor(Math.random()*100+1);//Genero un número aleatorio que vaya del 1 al 100
        Scanner entrada = new Scanner(System.in);//Inicio el scanner para pedir un número al usuario
        System.out.println("Intenta adivinar el numero aleatorio generado:");
        num = entrada.nextInt();//Asigno la entrada del usuario a la variable num
        do{
            if(num<aleatorio){//Pongo la condición de que, si el usuario ha introducido un número menor que el generado aleatoriamente:
                System.out.println("El número introducido es menor que el que aleatorio.");
                num = entrada.nextInt();
            }else if(num>aleatorio){//Si es mayor que el aleatorio:
                System.out.println("El número introducido es mayor que el aleatorio.");
                num = entrada.nextInt();
            }
            intentos++;
                
        }while(num!=aleatorio);//El bucle se repite mientras el número introducido sea distinto del aleatorio
        System.out.println("Enhorabuena, has adivinado el numero!");//Si el bucle ha terminado, el número es el mismo que el aleatorio
        System.out.println("Numero de intentos: "+intentos);
        
        // TODO code application logic here
    }
    
}
