/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class EjercicioCampos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner (System.in);
		 //int metros1=1

		 int metros;
		 int campos;
		 int div;
		 int salir=0;

		 while (salir==0) {

		 System.out.println("Por favor introduzca los metros cuadrados");
		 metros=entrada.nextInt();
		 System.out.println("Por favor introduce los campos de futbol");
		 campos=entrada.nextInt();

		 div=metros/campos;

		 if(div==5000) {
		 System.out.println("SI");
		 }
		 if(campos==0) {
		 System.out.println("ERROR, no se admiten 0 campos");
		 }

		 else {
		 System.out.println("NO");
		 }
		 System.out.println("por favor pulsa numero distinto a 0 para salir");
		 salir=entrada.nextInt();

		 }

	 }
		
}


