/**
 * 
 */
package PracticaDiaria;
import java.util.Scanner;
/**
 * @author david
 *9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

        //Declaramos una constante
        final double IVA=0.21;
 
        System.out.println("Introduce el precio de un producto");
        //Pasamos el String a double
        double precio= sc.nextDouble();
 
        //Obtenemos el precio final (precio+(precio*IVA))
        double precioFinal=precio+(precio*IVA);
 
        System.out.println(precioFinal);
		
		
		
		
	}

}
