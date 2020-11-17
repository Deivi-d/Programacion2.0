/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int numero; 

        int multiplo; 

        int contador=1; 

        int base; 

         

        System.out.println("Escribe la base a calcular:"); 

        Scanner sc=new Scanner(System.in); 

        numero=sc.nextInt(); 

        System.out.println("Escribe la potencia a calcular:"); 

        multiplo=sc.nextInt(); 

         

        base=numero; 

         

        do { 

            numero=numero*base; 

            contador=contador+1; 

        }while(contador!=multiplo); 

         

        		System.out.printf("El calculo es %d",numero); 

         

        					scn.close(); 

  

    } 

  
}

