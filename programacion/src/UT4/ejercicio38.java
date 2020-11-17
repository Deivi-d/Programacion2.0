/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *Dibujar un cuadrado con * pidiendole al usuario el numero de * por lado,  
 *pero solo pintando los * pares en las lineas pares y los impares en las impares 
 */
public class ejercicio38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int lado = 0;
		
		
		System.out.println("escribe el lado del cuadrado");
		lado=sc.nextInt();
		
//		lado= 4
//		linea 1 *   *
//		linea 2   *  
//		linea 3 *   *
//		lina  4   *  *			 
		for(int i = 1; i<=lado; i++) {
			
			for(int j=1; j<=lado;j++) {
					
				if(i% == 0) {
					if (j%2 == 0)
						System.out.print("* ");
				    else 
					System.out.print(" ");
				}
				else {
					if(i% == 0)
						System.out.print(" ");
				}
			
		}
		
		sc.close();
	}

}
