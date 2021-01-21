/**
 * 
 */
package UT621;

import java.util.ArrayList;

/**
 * @author david
 *
 */
public class Actividad21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador c1 = new Contador();
		Contador c2 = new Contador(5);
		System.out.println("Valor del contador 1: " + c1.getContador());
		System.out.println("Valor del contador 2: " + c2.getContador());
		c2.incrementar();
		System.out.println("Valor del contador 2 despues de incrementar: " + c2.getContador());
		c2.decrementar();
		System.out.println("Valor del contador 2 despues de decrementar: " + c2.getContador());
		Contador c3 = new Contador(2);
		c3.incrementar();
		System.out.println("Valor del contador 3 despues de incrementar: " + c3.getContador());
		
		ArrayList<Contador> contadores = new ArrayList<Contador>();
		contadores.add(c1);
		contadores.add(c2);
		contadores.add(c3);
		for(int i=0; i<contadores.size();i++) {
			contadores.get(i).decrementar();
			System.out.println("Valor del contador" + (i+1) + "_" + contadores.get(i).getContador());
		}
	}

}
