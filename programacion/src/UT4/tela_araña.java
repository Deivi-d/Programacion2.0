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

			System.out.println("inserta un numero para la tela de araña");
			tela = sc.nextInt();
			int contador = 1;	
			
			while (pesoacumulado < tela && elefante != 0) {
				
				System.out.println("Dame el peso del elefante numero: " + contador);
				contador++;
				elefante = sc.nextInt();
				pesoacumulado = pesoacumulado + elefante;
			}
			if (pesoacumulado >= tela) {
				System.out.println("Se ha roto");
			}	
			else {
				System.out.println("Ha aguantado");
			}
			pesoacumulado = 0; // Reset, se acumulaban antes. 
			elefante = 1; //Todo parece necesitar reset para funcionar.
		}
						sc.close();
	}

}


