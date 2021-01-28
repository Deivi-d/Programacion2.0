/**
 * 
 */
package UT622;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class Actividad22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String titulo, autor;
		int ejemplares;

		// creo el objeto libro1 utilizando el constructor con parametros

		Libro libro1 = new Libro("la casa de la pradera", "Chiquito de la Calzada", 11, 9);

		// creo el objeto libro2 utilizando el constructor con parametros
		Libro libro2 = new Libro("el utlimo mohicano", "Kiko Rivera", 5, 4);

		// muestro por pantalla los datos del objeto libro 1 y libro 2
		// utilizo los metodos getter para acceder al valor de los atributos

		System.out.println("Libro 1: ");
		System.out.println("Titulo: " + libro1.gettituto());
		System.out.println("Autor: " + libro1.getautor());
		System.out.println("Ejemplares" + libro1.getejemplares());
		System.out.println("Prestados" + libro1.getprestados());
		System.out.println();

		// realizo un prestamo del libro1. El metodo devuelve true si se ha podido
		// realidzar el prestamo y false en caso contrario

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.gettituto());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.gettituto() + "para prestar");
		}

		// realizo una devulucion de libro1. El metodo devuelve true si se ha podido
		// realizar la devulucion y false en caso contrario

		if (libro1.devolucion()) {
			System.out.println("se ha devuelto el libro " + libro1.gettituto());
		} else {
			System.out.println("no hay ejemplares del libro " + libro1.gettituto() + "prestados");
		}

		/*
		 * realizo otro prestamo del libro1. En este caso no se podra ralizar ya que
		 * solo hay un ejemplar de este libro y ya que esta prestado. Se mostrara por
		 * pantalla el mensaje "no quedan ejemplares del libro"
		 */
		if (libro1.prestamo()) {
			System.out.println("se ha prestado el libro " + libro1.gettituto());
		} else {
			System.out.println("no quedan ejemplares del libro " + libro1.gettituto() + "para prestar");
		}
		System.out.println();
		// mostrar los datos del objeto libro1
		System.out.println("Libro 1: ");
		System.out.println("Titulo: " + libro1.gettituto());
		System.out.println("Autor: " + libro1.getautor());
		System.out.println("Ejemplares " + libro1.getejemplares());
		System.out.println("Prestados: " + libro1.getprestados());
		System.out.println();

		// muestro los datos del objeto libro2

		System.out.println("Libro 2: ");
		System.out.println("Titulo: " + libro2.gettituto());
		System.out.println("Autor: " + libro2.getautor());
		System.out.println("Ejemplares " + libro2.getejemplares());
		System.out.println("Prestados: " + libro2.getprestados());
		System.out.println();
	}

}
