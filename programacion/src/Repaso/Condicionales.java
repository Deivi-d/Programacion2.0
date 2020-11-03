/**
 * 
 */
package Repaso;

/**
 * @author david
 *
 */
public class Condicionales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //uso de if - else - else if 

        //escribir si un numero es par o impar 

        int numero = 23; 

         

        if (numero%2==0) { 

            System.out.println("es par"); 

        } else  

        System.out.println("es impar"); 

         

        //indicar si es multiplo de 10,2,de3 o de ninguno de estos 

        if (numero%10==0) { 

            System.out.println("es multiplo de 10"); 

        }else if (numero%2==0){ 

            System.out.println("es multiplo de 2"); 

        }else if (numero%3==0){ 

            System.out.println("es multiplo de 3");     

        }else  

            System.out.println("ningun caso de estos"); 

         

        //uso de distintos operadortes logicos (<,>,!=,&&,||) 

        if (numero%2==0 && numero%3==0 && numero%10!=0); 

        

    } 

     

} 
	


