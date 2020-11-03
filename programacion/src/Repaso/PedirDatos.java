/**
 * 
 */
package Repaso;

/**
 * @author david
 *
 */
public class PedirDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //pedir numeros enteros 

        Scanner entrada = new Scanner(System.in); 

        System.out.println("Introduce un dato de tipo entero"); 

        int entero = entrada.nextInt(); 

        System.out.printf("El entero introducido es: %d \n\n", entero ); 

         

        //pedir numeros decimales 

        System.out.println("Introduce un numero decimal"); 

        float decimal = entrada.nextFloat(); 

        System.out.printf("El decimal introducido es %f \n\n", decimal); 

         

        //pedir frase o tipo cadena. Leer \n se queda en buffer despues del float anterior 

        entrada.nextLine(); 

        System.out.println("Introduce un dato de tipo cadena"); 

        String frase = entrada.nextLine(); 

        System.out.printf("La frase introducida es: %s", frase); 

         

        entrada.close(); 

	} 



} 
	


