/**
 * 
 */
package UT5;

/**
 * @author david
 *Crear y mostrar un array bidimensional de 10 x 10.  

En cada posición se guardará (fila*columna). 
 */
public class ejercicio70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] tabla= new int[10][10];
		int columna;
		
		for (int fila=0;fila<10;fila++) {
			
			for (columna=0;columna<10;columna++) {
				tabla[fila][columna] = (int) (Math.random()*100);
				System.out.print(tabla[fila][columna] + "\t");
			}
			
			System.out.println("  ");
		}
		
	}

}
  