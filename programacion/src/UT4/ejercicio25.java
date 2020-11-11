/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author david
 *decir si un numero es primo o no 
 */
public class ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int contador,I,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
            
            
        }
        
         sc.close();
    }

}


