/**
 * 
 */
package Examen;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ejecutarPrograma = true;
		int[] taquillas;
		taquillas = new int[10];
		for (int e = 0; e < taquillas.length; e++) {
			taquillas[e] = 0;
		}

		int menu;
		int taquillaSeleccionada;
		while (ejecutarPrograma) {

			String mostrarTaquillas = "Las taquillas ";
			System.out.println("1 para cerrar taquilla");
			System.out.println("2 para abrir taquilla");
			System.out.println("0 para salir");
			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();

			if (menu == 1 || menu == 2 || menu == 0) {

				switch (menu) {
				case 1:
					for (int e = 0; e < taquillas.length; e++) {
						if (taquillas[e] == 0) {
							mostrarTaquillas += e;
							mostrarTaquillas += ", ";
						}

					}
					System.out.println(mostrarTaquillas
							+ "Son las taquillas actualmente abiertas que puede cerrar por favor seleccione una de ellas");

					Scanner sc1 = new Scanner(System.in);
					taquillaSeleccionada = sc1.nextInt();
					if (mostrarTaquillas.contains(" " + taquillaSeleccionada)) {
						taquillas[taquillaSeleccionada] = 1;
						System.out.println("La taquilla " + taquillaSeleccionada + " ahora se encuentra cerrada");
					} else {
						System.err.println("Ese numero de taquilla no esta disponible");
					}
					break;
				case 2:
					for (int e = 0; e < taquillas.length; e++) {
						if (taquillas[e] == 1) {
							mostrarTaquillas += e;
							mostrarTaquillas += ", ";
						}
					}
					System.out.println(mostrarTaquillas
							+ "Son las taquillas actualmente cerradas que puede abrir por favor seleccione una de ellas");
					Scanner sc11 = new Scanner(System.in);
					taquillaSeleccionada = sc11.nextInt();
					if (mostrarTaquillas.contains(" " + taquillaSeleccionada)) {
						taquillas[taquillaSeleccionada] = 1;
						System.out.println("La taquilla " + taquillaSeleccionada + " ahora se encuentra abierta");
					} else {
						System.err.println("Ese numero de taquilla no esta disponible");
					}
					break;
				case 0:
					ejecutarPrograma = false;
					System.out.println("Fin del programa ");
					break;
				}
			} else {
				System.out.println("El valor no es correcto, por favor introduzca un valor valido");
			}

			System.out.println(menu);

		}
	}
}
