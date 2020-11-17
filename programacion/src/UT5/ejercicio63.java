/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author david
 *Crear un array de enteros de 10 posiciones, pedir números al usuario hasta rellenarlo. 
 *Mostrar a continuación la media de los numeros del array y cuál es el mayor y el menor. 
 */
public class ejercicio63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			
			int enteros[];
			enteros = new int[10];
			int suma_de_numeros=0;
			int mayor=0;
			int menor=0;
			
			for(int i=0; i<enteros.length; i++) {
				System.out.println("Introduce el numero de la posicion:" +i);
				enteros[i]= sc.nextInt();
				
			}
			
			for(int j=0; j<enteros.length; j++) {
				suma_de_numeros = suma_de_numeros + enteros[j];
				if(j == 0) {
					menor=enteros[j];
					mayor=enteros[j];
				}
				
				if (enteros[j]<menor)
					menor=enteros[j];
				if (enteros[j]>mayor);
				
					System.out.printf("la media de los numeros es:\n" + suma_de_numeros/10);
					System.out.printf("este es el numero menor: %d\n",  menor);
					System.out.printf("este es el numero mayor: %d\n",  mayor);
			}
			
			
			sc.close();
			
	}
	

}
