/**
 * 
 */
package PracticaDiaria;

/**
 * @author david
 *12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
public class Ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bucle while
		/*int numero=1;
		
		while(numero<=100) {
			if(numero%2==0 || numero%3==0) {
				System.out.println(numero);
			}
			numero++;
		}*/
		
		//con un bucle for
		for(int numero=1;numero<=100;numero++) {
			if(numero%2==0 || numero%3==0) {
				System.out.println(numero);
			}
			
			
		}
		
	}

}
