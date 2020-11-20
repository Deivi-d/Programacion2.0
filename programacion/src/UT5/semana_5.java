/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author david
 * ESCALERA DE COLOR
 */
public class semana_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		String[] palo= {"Picas", "Corazones", "Diamantes", "Treboles"};
		
		int cartas = new int[4];
		
		for(cartas=0;cartas<4;cartas++){
			
			for(numeros=0;numeros<13;numeros++) {
				
				System.out.println("Por favor deme 4 cartas");
				
					cartas = sc.nextInt();
			}
		}
		
	}
}
