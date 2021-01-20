/**
 * 
 */
package objetos;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class GEOMETRIA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double altura;
		double radio;
		
		System.out.println("Introduce altura: ");
		altura = sc.nextDouble();
		System.out.println("Introduce radio: ");
		radio = sc.nextDouble();
		
		Cilindro micilindro = new Cilindro (altura,radio);
		System.out.println("El area del cilindro es:  " + micilindro.altura);
		System.out.println("El area del cilindro es:  " + micilindro.area());
		System.out.println("El area del cilindro es:  " + micilindro.volumen());
		sc.close();
	}

}
