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
public class OtroExcepciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("el indice esta fuera del array");
				System.out.println("ha ocurrido una excepcion " + a.getMessage());
			} catch (InputMismatchException e) {
				System.out.println(" valor incorrecto para un indice");
				System.out.println("ha ocurrido una exception " + e.toString());
			} finally {
				//System.out.println("En el finally"); --> para comprobar que entra en el finally
				sc = new Scanner(System.in);
			}

			System.out.println("continuo con el programa");
		}
	}
		//cambio
}
