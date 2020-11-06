/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 1;
		int suma = 0;
		
		System.out.println("Por favor introduce un numero");
		
		while (numero !=0) {
			numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.println("la suma de los numeros es:" +suma);
		
		sc.close();

	}
	
}