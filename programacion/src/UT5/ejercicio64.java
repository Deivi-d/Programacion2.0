/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class ejercicio64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[], b[], c[];
		int i,j;
		a=new int[10];
		b=new int[10];
		// la tabla c tendr� que tener el doble de tama�o que a y b.
		c = new int [20];
		// leemos la tabla a
			System.out.println("Leyendo la tabla a");
			
		for (i=0;i<10;i++){
			System.out.print("n�mero: ");
			a[i]= sc.nextInt();
		}
		// leemos la tabla b

			System.out.println("Leyendo la tabla b");
			
		for (i=0;i<10;i++){
			System.out.print("n�mero: ");
			b[i]= sc.nextInt();
		}
		// asignaremos los elementos de la tabla c
		// para las tablas a y b utilizaremos como �ndice i
		// y para la tabla c utilizaremos como �ndice j.
			j=0;
		for (i=0;i<10;i++){
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
			System.out.println("La tabla c queda: ");
		for (j=0;j<20;j++) // seguimos utilizando j, para la tabla c. Aunque se podr�a utilizar i.
			System.out.print(c[j]+" ");
			System.out.println("");
		
				sc.close();
			
		}
				
}

