/**
 * 
 */
package UT725;

import java.util.Scanner;

import java.util.ArrayList;

/**
 * @author david
 *
 */
public class Actividad25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Playlist miPlaylist = new Playlist("Playlist de David");
		Cancion nuevaCancion = new Cancion("Get Lucky", "Daft Punk", 3);
		Cancion nuevaCancion2 = new Cancion("Hawawai", "Maluma", 4);
		System.out.println("Cancion 1:\n");
		System.out.println("Titulo: " + nuevaCancion.getTitulo());
		System.out.println("Artista: " + nuevaCancion.getArtista());
		System.out.println("Duracion: " + nuevaCancion.getDuracionMinutos() + " minutos\n");

		Scanner sc = new Scanner(System.in);
		int menu = 12;

		while (menu != 0) {
			System.out.println("Elige una de estas opciones: \n");
			System.out.println("1.Pulsa '1' para añadir una cancion");
			System.out.println("2.Pulsa '2' para obtener una cancion");
			System.out.println("3.Pulsa '3' para ver el total de canciones");
			System.out.println("3.Pulsa '4' para mostrar una Playlist");
			System.out.println("4.Pulsa '5' para ver los que dura la Playlist");
			System.out.println("5.Pulsa '6' para reproducir la Playlist");
			System.out.println("6.Pulsa '7' para reproducir una cancion");
			System.out.println("7.Pulsa '8' para borrar toda la Playlist");
			System.out.println("8.Pulsa '9' para eliminar una cancion");
			System.out.println("9.Pulsa '10' para encontrar cancion por titulo");
			System.out.println("10.Pulsa '11' para encontrar cancion por artista");
			System.out.println("12.Pulsa '0' para salir");
			menu = sc.nextInt();
			if (menu == 1) {
				miPlaylist.anyadirCancion(nuevaCancion);
				System.out.println("Perfecto, has añadido una nueva cancion a tu Playlist");
			} else if (menu == 2) {
				miPlaylist.obtieneCancion(2);
				System.out.println("Aqui tienes la cancion que buscabas" + miPlaylist.obtieneCancion(0));
			} else if (menu == 3) {
				miPlaylist.obtieneTotalCanciones();
			} else if (menu == 4) {
				System.out.println("El nombre de la Playlist es: " + miPlaylist.getNombre() + "\n");
			} else if (menu == 5) {
				miPlaylist.totalDuracionPlaylist();
				System.out.println("Tu Playlist dura: " + miPlaylist.totalDuracionPlaylist() + " minutos");
			} else if (menu == 6) {
				miPlaylist.reproducirPlaylist();
				System.out.println();
			} else if (menu == 7) {

			} else if (menu == 8) {
				miPlaylist.limpiarPlaylist();
				System.out.println("Lista vacia");

			} else if (menu == 9) {
				int posicion = 3;
				miPlaylist.eliminarCancion(posicion);
			} else if (menu == 10) {
				miPlaylist.encontrarCancionPorTitulo(null);
			} else if (menu == 11) {
				miPlaylist.encontrarCancionPorTitulo(null);
			} else if (menu == 12) {

			}
		}
	}
}