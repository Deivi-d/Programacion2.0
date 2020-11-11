/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 

        System.out.println("Pon un numero: "); 

        int numero = sc.nextInt(); 

         

        for (int i = 0; i <= numero; i++) { 

             

            if (i%2==0) { 

                System.out.println(i); 
                
                sc.close();

            }     

        } 

    } 

} 