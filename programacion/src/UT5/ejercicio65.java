/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/* Leer por teclado una serie de 10 n�meros enteros. La aplicaci�n debe indicarnos si los n�meros est�n
		 ordenados de forma creciente, decreciente, o si est�n desordenados*/
		
		Scanner sc = new Scanner(System.in);
			
		int enteros[];
		enteros = new int[10];
		boolean creciente;
		boolean decreciente;

		
		
		for (int i=0; i<enteros.length; i++) {
			
			System.out.println("Introduce el numero:" );
			enteros[i]= sc.nextInt();
			
		}
		// determinar si est� ordenado de forma creciente 
		
			creciente = true;
			decreciente = true;
			
			for (int i = 1; i < enteros.length - i;) {
				
				for(int j = 0; j<enteros.length - i; j++) {
					
					
					if (enteros[j]>enteros[j + 1]) {
						
						creciente=false;
						
					}	
					
					if (enteros[j] < enteros[j + 1]) {
						
						decreciente = false;	
						
					}
				


					
						}
				
				
					}
		
		  if(creciente) {
			  
			  System.out.println("Los numeros introducidos estan ordenados de forma creciente");
			  
		  }
		  
		  if (decreciente) {
			  
			  System.out.println("Los numeros estan ordenados de forma decreciente");
		  }
		  
		  if (!(decreciente) || creciente) {
			  
			  System.out.println("Los numeros introducidos estan deserdenados");
		  }
		
		  		sc.close();
	}
		
}
