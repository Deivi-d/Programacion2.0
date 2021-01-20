/**
 * 
 */
package PracticaDiaria;
import java.util.Scanner;
/**
 * @author david
 *6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 */
public class Ej5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un mumero");
		
		int numero = sc.nextInt();

		
		if(numero %2== 0) {
			System.out.println("El numero " + numero + " es divisible entre 2" );
		}else {
			System.out.println("El numero " + numero + " no es divisible entre 2");
		}
		
	}

}
