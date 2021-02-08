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
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Elige una opcion");
			System.out.println("1. Escribe '1' para añadir una nueva cancion a tu Playlist");
			System.out.println("2. Escribe '2' para buscar tu cancion");
			System.out.println("3. Escribe '3' para consultar el numero de canciones en tu Playlist");
			System.out.println("4. Escribe '4' para mostrar toda tu Playlist");
			System.out.println("5. Escribe '5' para ver el total de minutos de tu Playlist");
			System.out.println("6. Escribe '6' para comenzar a escucharla por completo");
			System.out.println("7. Escribe '7' para escucharla");
			System.out.println("8. Escribe '8' para borrar toda tu Playlist");
			System.out.println("9.Escribe '9' para quitar una cancion de tu Playlist");
			System.out.println("10. Escribe '10' para seleccionar una cancion por su titulo");
			System.out.println("11. Escribe '11' para seleccionar una cancion por su autor");
			System.out.println("12. Escribe 'salir' para salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				anyadirCancion();
			case 2:
				obtieneCancion();
			case 3: 
				obtieneTotalCanciones();
			case 4: 
				mostrarPlaylist();
			case 5: 
				totalDuracionPlaylist();
			case 6: 
				reproducirPlaylist();
			case 7: 
				reproducirCancion();
			case 8: 
				limpiaPlaylist();
			case 9: 
				eliminarCancion();
			case 10: 
				encontrarCancionPorTitulo();
			case 11: 
				encontrarCancionPorArtista();
			}
		} while (opcion != 12);
		


	}



	/* metodo para añadir canciones a la playlist
	public static void anyadirCancion(ArrayList<Cancion> Canciones) {
		Scanner sc = new Scanner(System.in);
		Cancion nuevacancion = new Cancion();
		System.out.println("Añade una cancion a tu Playlist");
		System.out.println("¿Cuál es su titulo?");
		nuevacancion.setTitulo(sc.next());
		System.out.println("¿Cuál es su artista?");
		nuevacancion.setArtista(sc.next());
		System.out.println("¡Perfecto! Acabas de añadir una nueva cancion a tu Playlist");
	
	}

}
