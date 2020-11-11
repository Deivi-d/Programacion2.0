/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class tela_araña {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int tela = 1;
		int elefante = 1;
		int pesoacumulado = 0;
	
		while (tela != 0) {

			System.out.println("Inserta un numero para la tela de araña");
			tela = sc.nextInt();
			int contador = 1;	
			
			while (pesoacumulado < tela && elefante != 0) {
				
				System.out.println("Dame el peso del elefante numero: " + contador);
				contador++;
				elefante = sc.nextInt();
				pesoacumulado = pesoacumulado + elefante;
			}
			if (pesoacumulado >= tela) {
				System.out.println("¡ups! La tela de araña se ha roto");
			}	
			else {
				System.out.println("La tela resiste el peso de los elefantes");
			}
			pesoacumulado = 0; 
		}
						sc.close();
	}

}


