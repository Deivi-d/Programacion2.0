/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class Ejerciciom15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner sc= new Scanner(System.in); 

        

        System.out.println("Por favor, introduce un numero: "); 

         

        int contador = 1; // contador inicializado a 1 

        //Guardo en la variable numero lo que el usuario introduzca por teclado. 

        int numero1 = sc.nextInt(); 

     

        //Con bucle while 

        while(contador <=10) { 

            System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador); 

            contador++; 

        } 

         

        //Con bucle do-while 

        contador = 1; 

        do{ 

            System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador); 

            contador++;             

        }while(contador <= 10); 

         

        //Con bucle for 

        for(contador = 1; contador<=10; contador++) { 

            System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador); 
            
            sc.close();

        } 

         
        

    } 

  

}

