/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in); 

        System.out.println("escribe numero inicial"); 

        int start = sc.nextInt(); 

        System.out.println("escribe numero final"); 

        int stop = sc.nextInt(); 

        System.out.println("escribe  intervalo"); 

        int intervalo = sc.nextInt(); 

         

        for (int i = start; i<=stop ; i=i+intervalo); 

         

       
		System.out.print( intervalo + " "); 

         

        sc.close(); 

    } 

  

} 
	


