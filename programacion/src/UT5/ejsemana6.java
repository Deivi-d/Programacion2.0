/**
 * 
 */
package UT5;
import java.util.Scanner;

/**
 * @author david
 *programa para anagramas
 */
public class ejsemana6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//creamos un bucle while para darle la opcion de salir al usuario al final 
		boolean ejecutarPrograma = true;
	
		
		//creamos un bucle while para darle la opcion de salir al usuario al final 
		while (ejecutarPrograma) {
			
			//pedimos la primera frase imprimiendo por pantalla
			System.out.println("Introduce la primera frase");
			//escaneamos la primera frase
			String frase1 = sc.nextLine();
			//creamos un metodo .replace para cambiar un caracter por un espacio
			//la funcion tolowecase es para que el programa no falle si el usuario mete una mayuscula
			String frase1SinEspacios = frase1.replace(" ", "").toLowerCase();
			// usamos un condicional para delimitar la frase a 1000 caracteres
			if(frase1.length()>1000) {
				//si ha superado el maximo le pintamos por pantalla
				System.out.println("Has alcanzado el máximo de caracteres permitido");
			}else {
			//pedimos la segunda frase
			System.out.println("Introduce la segunda frase");
			}
			//escaneamos la segunda frase
			String frase2 = sc.nextLine();
			
			String frase2SinEspacios = frase2.replace(" ", "").toLowerCase();
			int a = 0;
			
			//usamos arrays para guardar cada letra en una posicion.
			char[] Arrayfrase1;
			Arrayfrase1 = new char[frase1SinEspacios.length()];
			char[] Arrayfrase2;
			Arrayfrase2 = new char[frase2SinEspacios.length()];
			Arrayfrase1 = frase1SinEspacios.toCharArray();
			Arrayfrase2 = frase2SinEspacios.toCharArray();
			
			//empezamos a analizar la frase letra por letra utilizando un for
			if (frase1SinEspacios.length() == frase2SinEspacios.length()) {
				for (int i = 0; i < frase2SinEspacios.length(); i++) {
					for (int e = 0; e < frase1SinEspacios.length(); e++) {
						if (Arrayfrase2[e] == Arrayfrase1[i]) {
							Arrayfrase1[i] = ' ';
							Arrayfrase2[e] = ' ';

						}
					}
				}
			}
			for (int e = 0; e < Arrayfrase1.length; e++) {
				if (Arrayfrase1[e] != ' ') {
					a++;
				}
			}
			if (a == 0) {
				System.out.println(frase1 + " y " + frase2 + " SI son anagramas");
			} else {
				System.out.println(frase1 + " y " + frase2 + " NO son anagramas");
			}
			//preguntamos al usuario si quiere salir del programa
			System.out.println("¿Desea salir? Si es así,introduce salir para salir");
			String salida = sc.nextLine();
			
			if (salida.equals("salir")) {
				ejecutarPrograma = false;
			}

		}
		//nos despedimos del usuario 
		System.out.println("Hasta pronto!");
		//cerramos el escaner
		sc.close();
	}

}
