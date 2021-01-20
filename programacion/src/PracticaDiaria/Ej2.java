/**
 * 
 */
package PracticaDiaria;

/**
 * @author david
 *Ejercicio 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. 
 */
public class Ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaramos las variables
		int numero1 = 200;
		int numero2 = 200;
		//hacemos una comrprovacion con un if y un if anidado
		if (numero1>=numero2) {
			if (numero1==numero2) {
				System.out.println("Los numeros  " + numero1 + "  y  " + numero2 + "  son iguales");
			}else {
				System.out.println("El numero  " + numero1 + "  es mayor que el numero  " + numero2);
			}
		}else {
			System.out.println("El numero  " + numero2 + "  es mayor que el numero  " + numero1);
		}
	}
	
}


