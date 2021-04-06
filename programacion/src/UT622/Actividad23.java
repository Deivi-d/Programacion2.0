/**
 * 
 */
package UT622;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author david
 *
 */
public class Actividad23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 9;
		int id = 0;
		String titulo, autor;
		int ejemplares, prestados;
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> Biblioteca = new ArrayList<Libro>();
		// Libro libro1 = new Libro();
		// Libro libro2 = new Libro();
		Libro nuevolibro = new Libro();
		while (menu != 0) {
			System.out.println("\n0.Salir/n1.Alta Libro\n2.Consulta Libro \n3.Baja Libro\n4.Prestamo Libros");
			System.out.println("Elige una opción");
			menu = sc.nextInt();
			if (menu == 1) {
				añadirLibro(Biblioteca);
			} else if (menu == 2) {
				for (int i = 0; i < Biblioteca.size(); i++) {
					System.out.println("ID Libro:" + i);
					System.out.println("\nTitulo del Libro" + Biblioteca.get(i).gettituto());
					System.out.println("\n Autor del Libro" + Biblioteca.get(i).getautor());
					System.out.println("\n Numero de ejemplares" + Biblioteca.get(i).getejemplares());
					System.out.println("\n Numero de prestados" + Biblioteca.get(i).getprestados());
				}

			} else if (menu == 3) {
				System.out.println("dime el id del libro que quieres eliminar: ");
				id = sc.nextInt();
				Biblioteca.remove(id);
			} else if (menu == 4) {
				int id_max = Biblioteca.size();
				int y = 0;
				while (y == 0) {
					System.out.println(
							"dime el id del libro que quieres coger prestado,debe ser menor que " + id_max + ":");
					id = sc.nextInt();
					if (id < id_max) {
						y = 1;
					}
					nuevolibro=Biblioteca.get(id);
					if(nuevolibro.prestamo()) {
						System.out.println("Se ha prestado el libro" + nuevolibro.gettituto());
					}else {
						System.out.println("No quedan ejemplares del libro "+nuevolibro.gettituto()+" para prestar");
					}
				}

			}
		}
	}

	private static void añadirLibro(ArrayList<Libro> biblioteca) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Libro nuevolibro=new Libro();
		System.out.println("Introduce el titulo");
		nuevolibro.settitulo(sc.next());
		System.out.println("Introduce el autor");
		nuevolibro.setautor(sc.next());
		System.out.println("¿Cuántos ejemplares quieres?");
		nuevolibro.setejemplares(sc.nextInt());
		//Biblioteca.add(nuevolibro);
		System.out.println("Has añadido un nuevo libro");
	}

}
