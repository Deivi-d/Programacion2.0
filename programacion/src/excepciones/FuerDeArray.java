/**
 * 
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author david
 *
 */
public class FuerDeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int indice1;
		int indice2;
		boolean ok = false;
		while (!ok) {


			try {
				System.out.println("introduce un inidice del array: ");
				indice1 = sc.nextInt();
				System.out.println("El valor es " + test[indice1]);
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("el indice esta fuera del array");
				System.out.println("ha ocurrido una excepcion " + ae.getMessage());
			} catch (InputMismatchException ie) {
				System.out.println(" valor incorrecto para un indice");
				System.out.println("ha ocurrido una exception " + ie.toString());
			} finally {
				System.out.println("En el finally");
				sc = new Scanner(System.in);
			}

			System.out.println("continuo con el programa");
		}

	}

}
