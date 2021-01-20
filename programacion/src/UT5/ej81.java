/**
 * 
 */
package UT5;
import java.util.Scanner;
/**
 * @author david
 *Método al que se le pasan dos enteros y muestra todos los  
números comprendidos entre ellos, ellos inclusive. Llamad al metodo intervalo 
 */
public class ej81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int numero1 = Sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = Sc.nextInt();
		
		intervalo(numero1,numero2);
		int resultado[]=intervalo2(numero1,numero2);
		for (int i=0;i<resultado.length;i++) {
			System.out.println(resultado[i]);
		}
	}
	private static void intervalo(int numero1,int numero2) {
		
		for(int i=numero1;i<=numero2;i++) {
			System.out.println(i);
			
		}
	}
	
	private static int[] intervalo2(int numero1,int numero2) {
		int array1[]=new int[numero2-numero1];
		for(int i=numero1,j=0;i<=numero2;i++,j++) {
			
			
		}
	}

}	
