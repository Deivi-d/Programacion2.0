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
		
		System.out.println("Selecciona una opci�n: \n1:Bailando \n2:Sol \n3:Pasito");
		
		int cancion= sc.nextInt();
		
		switch (cancion){
			
			case 1:
				System.out.println("Bailando bailando tu cuerpo y el mio llenando el vacio Subiendo y bajando");
				
				break;
			case 2:
				System.out.println("Sol, playa y en la arena, vamo' all� Y hace calor, y hace calor Qu�tate el pantal�n");
				
				break;
			case 3:
				System.out.println("Despacito Quiero respirar tu cuello despacito Deja que te diga cosas al o�do Para que te acuerdes si no est�s conmigo");
				
				sc.close();
		}
	}

}
