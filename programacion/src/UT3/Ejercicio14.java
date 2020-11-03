/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int salir = 5; 

        int viaje; 

        int asiento; 

        int equipaje; 

        int menor; 

        int comida; 

        int mayor; 

        int viajero; 

         

        Scanner sc = new Scanner(System.in);  

  

        System.out.println("¡Hola!");  

  

        do { 

         

        System.out.println("¿Cuanto le cuesta el viaje?");  

  

        viaje=sc.nextInt();  

  

        System.out.println("¿Desea elegir asiento?(Pulse 1 para si o 0 para no)");  

  

        asiento=sc.nextInt();  

  

        System.out.println("¿Lleva equipaje?(Pulse 1 para si, 0 para no)");  

  

        equipaje=sc.nextInt();  

  

        System.out.println("¿Tiene menos de 14 años? (Pulse 1 para si, 0 para no)");  

  

        menor=sc.nextInt();  

  

        System.out.println("¿Va a querer una comida en el vuelo? (Pulse 1 para si, 0 para no)");  

  

        comida=sc.nextInt();  

  

        System.out.println("¿Es mayor de 60 años?(Pulse 1 para si, 0 para no)");  

  

        mayor=sc.nextInt();  

  

        System.out.println("¿Tiene la tajeta de `Viajero frecuente`?(Pulse 1 para si, 0 para no)");  

  

        viajero=sc.nextInt();  

  

        if (menor==1) {  

  

            viaje=viaje/2;  

  

            if (equipaje==1) {  

  

                viaje+=20;  

  

            }  

  

        }  

  

        if(comida==1) {  

  

            if (mayor==0||viajero==0) {  

  

                viaje+=20;  

  

            }  

  

        }  

  

        if (asiento==1) {  

  

            viaje+=10;  

  

        }  

  

        if (equipaje==1 && menor==0) {  

  

            viaje+=50;  

  

        }  

  

        System.out.println("El viaje le saldria por "+viaje+" Euros");  

  

         

        System.out.println("por favor si desea salir pulse 5"); 

         

        } while(salir == 5); 

         

    } 

     

         

     

  


}


