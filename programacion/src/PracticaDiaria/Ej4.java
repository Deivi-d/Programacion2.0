/**
 * 
 */
package PracticaDiaria;
import java.util.Scanner;
/**
 * @author david
 *4) Modifica la aplicaci�n anterior, para que nos pida el nombre que queremos introducir 
 */
public class Ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("�C�mo te llamas?");
		
		String nombre = sc.next();
		
		System.out.println("Bienvenido " + nombre);
	}

}
