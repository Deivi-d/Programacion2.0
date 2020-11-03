/**
 * 
 */
package Repaso;

/**
 * @author david
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //enteros,ocupan 4 bytes en memoria 

        //enteros 

        int entero= 10; 

        //decimales 

        float dec_corto = 0; 

        double dec_grande; 

         

        //caracteres, ocupan 2 bytes 

        char letra; 

        //bytes 

        byte b; 

         

        //cadenas de caracteres 

        String cadena="Hola clase"; 

         

        //Declaracion 

        //Inicializacion 

        //Asignar valor 

        //Casting 

        b= (byte) entero; 

        System.out.println(b); 

         

        System.out.println(dec_corto); 

        String numero= "100"; 

        System.out.println(Integer.parseInt(numero)); 

         

        //operaciones con variables +,-,*,/,% 

         

        System.out.println(numero + numero); // concatenacion de cadenas 

        System.out.println(entero + entero + "aqui concateno enteros"); 

        // entero= 10 

        entero = entero/5; 

        //Operaciones resto 

        //aqui entero vale 2 

        int resto = entero%2; 

         

     

    } 

  

} 
	

