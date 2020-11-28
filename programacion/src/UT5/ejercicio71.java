/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner sc = new Scanner(System.in);
	     
	        int [][] a = new int[3][3]; 
	        int [][] b = new int[3][3];
	        int [][] c = new int[3][3]; 
	        int suma_de_numeros=0;
	        
	            //leer tabla a 

	            System.out.println("Cargando la tabla a"); 

	            for (int i=0; i<a.length; i++) { 

	                System.out.println(); 

	                for (int j=0; j<a[i].length; j++) { 

	                    System.out.print("Número " +i+ "." +j+ ": "); 

	                     

	                    a[i][j]=sc.nextInt(); 

	                } 

	            } 

	             

	            //leer tabla b 

	            System.out.println("\nCargando la tabla b"); 

	            for (int i=0; i<b.length; i++) { 
	                System.out.println(); 
	                for (int j=0; j<b[i].length; j++) { 
	                    System.out.print("Número " +i+ "." +j+ ": "); 

	                    b[i][j]=sc.nextInt(); 

	                } 

	            } 

	            //leer suma (que se mete en tabla c) 

	            for (int i=0; i<c.length; i++) { 

	                for (int j=0; j<c[i].length; j++) { 

	                     

	                    c[i][j] =  a[i][j] + b[i][j]; 

	                     

	                } 

	            } 

	            //pintar tabla a  

	            System.out.println("\nEste es el primer array"); 

	            for (int i=0; i<a.length; i++) { 

	                for (int j=0; j<a[i].length; j++) { 

	                    System.out.print("P." +i+ "." +j+ "| "); 

	                    System.out.print(a[i][j]+ " \t"); 

	                } 

	                System.out.print("\n"); 

	            } 

	            //pintar tabla b 

	            System.out.println("\nEste es el segundo array"); 

	            for (int i=0; i<b.length; i++) { 

	                for (int j=0; j<b[i].length; j++) { 

	                    System.out.print("P." +i+ "." +j+ "| "); 

	                    System.out.print(b[i][j]+ " \t"); 

	                } 

	                System.out.print("\n"); 

	            } 

	            //pintar tabla c (tercer array, la suma) 

	            System.out.println("\nEste es el tercer array (la suma de los dos primeros arrays)"); 

	            for (int i=0; i<c.length; i++) { 
	                for (int j=0; j<c[i].length; j++) { 
	                    System.out.print("P." +i+ "." +j+ "| " +a[i][j]+ " + " +b[i][j]+ " = ");  
	                    System.out.print(c[i][j]+ " \t"); 

	                } 

	                System.out.print("\n"); 

	            } 

	} 

	} 