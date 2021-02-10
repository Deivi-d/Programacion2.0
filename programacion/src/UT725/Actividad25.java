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
		Scanner sp = new Scanner(System.in);
		Playlist miPlaylist = new Playlist("Playlist de David");
		Cancion nuevaCancion = new Cancion();
		// System.out.println("Cancion 1:\n");
		// System.out.println("Titulo: " + nuevaCancion.getTitulo());
		// System.out.println("Artista: " + nuevaCancion.getArtista());
		// System.out.println("Duracion: " + nuevaCancion.getDuracionMinutos() + "
		// minutos\n");

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

			while (menu != 0) {
				menu = sp.nextInt();
				switch (menu) {

				case 1:
					Scanner sc = new Scanner(System.in);
					Scanner sn = new Scanner(System.in);
					System.out.println("Dime el titulo de la cancion");
					nuevaCancion.setTitulo(sn.nextLine());
					System.out.println("Dime el artista");
					nuevaCancion.setArtista(sn.nextLine());
					System.out.println("Por ultimo, dime cuanto dura la cancion");
					nuevaCancion.setDuracionMinutos(sc.nextFloat());
					miPlaylist.anyadirCancion(nuevaCancion);
					System.out.println("Perfecto, has añadido una nueva cancion a tu Playlist");
					break;
				case 2:
					Scanner se = new Scanner(System.in);
					int posicion_cancion = se.nextInt();
					System.out.println("Dime una posicion para poder encontrar una cancion");
					posicion_cancion = se.nextInt();
					System.out.println("Aqui tienes la cancion que buscabas" + miPlaylist.obtieneCancion(posicion_cancion));
					break;
				case 3:
					System.out.println("Hay " + miPlaylist.obtieneTotalCanciones() + " canciones en total");
					break;
				case 4:
					System.out.println("El nombre de la Playlist es: " + miPlaylist.getNombre() + "\n");
					break;
				case 5:
					System.out.println("Tu Playlist dura: " + miPlaylist.totalDuracionPlaylist() + " minutos");
					break;
				case 6:

					System.out.println(miPlaylist.reproducirPlaylist());
					break;
				case 7:
					miPlaylist.reproducirCancion(0);
					break;

				case 8:
					miPlaylist.limpiarPlaylist();
					System.out.println("Lista vacia");
					break;
				case 9:
					Scanner sl = new Scanner(System.in);
					System.out.println("Dime la posicion que quieres eliminar");
					int posicion = sl.nextInt();
					System.out.println("Ha eliminado la cancion de la posicion" + miPlaylist.eliminarCancion(posicion));
					break;
				case 10:
					Scanner sm = new Scanner(System.in);
					System.out.println("Dime el titulo de la cancion que deseas buscar");
					String titulo_cancion = sm.next();
					System.out.println(miPlaylist.encontrarCancionPorTitulo(titulo_cancion));
					break;
				case 11:
					Scanner st = new Scanner(System.in);
					System.out.println("Dime el autor de la cancion que deseas buscar");
					String artista_cancion = st.next();
					System.out.println(miPlaylist.encontrarCancionesPorArtista(artista_cancion));
					break;

				}
			}
		}
	}
}