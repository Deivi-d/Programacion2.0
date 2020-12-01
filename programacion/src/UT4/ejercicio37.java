/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int filas = 0;
		int columnas = 0;
		
		System.out.println("escribe numero de filas");
		filas=sc.nextInt();
		System.out.println("escribe numero de columnas");
		columnas=sc.nextInt();
		
		//prueba github 
		
//		filas=3, columnas= 5
//		* * * * *
//		* * * * *
//		* * * * *
		
		for(int i = 1; i<=filas; i++) {
			
			for(int j=1; j<=columnas;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
