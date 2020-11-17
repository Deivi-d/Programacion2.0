/**
 * 
 */
package Repaso;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class menu_canciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona una opción: \n1:Bailando \n2:Sol \n3:Pasito");
		
		int cancion= sc.nextInt();
		
		switch (cancion){
			
			case 1:
				System.out.println("Bailando bailando tu cuerpo y el mio llenando el vacio Subiendo y bajando");
				
				break;
			case 2:
				System.out.println("Sol, playa y en la arena, vamo' allá Y hace calor, y hace calor Quítate el pantalón");
				
				break;
			case 3:
				System.out.println("Despacito Quiero respirar tu cuello despacito Deja que te diga cosas al oído Para que te acuerdes si no estás conmigo");
				
				sc.close();
		}
	}

}
