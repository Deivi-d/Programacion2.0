package UT725;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

	// ATRIBUTOS privados

	private ArrayList<Cancion> canciones; // canciones (de tipo arraylist)
	private String Nombre; // nombre (de tipo String)

	// Constructor por defecto (vacio)

	public Playlist() {
		canciones = new ArrayList<Cancion>();
	}

	// Constructor con parametros
	public Playlist(String nombre) {
		this.setNombre(nombre); // parametro nombre
		canciones = new ArrayList<Cancion>(); // inicializo arraylist

		// getter y setters
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	// metodos de la clase playlist
	// metodo para añadir una cancion al arraylist que devuelve una cancion
	public void anyadirCancion(Cancion c) {
		Cancion a = new Cancion(c.getTitulo(), c.getArtista(), c.getDuracionMinutos());
		canciones.add(a);

	}

	// metodo para obtener la posicion de una cancion y devuelve la cancion que esta
	// en dicha posicion
	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);

	}

	// metodo para obtener el total de la arraylist(Playlist) y devuelve un numero
	// entero.
	public int obtieneTotalCanciones() {

		return canciones.size();

	}

	// desde la clase main pinta el nombre que hemos puesto a nuestra playlist
	public void mostrarPlaylist() {

	}

	// hacemos una suma de todos los minutos de cada cancion y devolvemos el total
	// de la suma
	public float totalDuracionPlaylist() {
		float suma = 0;
		for (Cancion c : canciones)
			suma = (suma + c.getDuracionMinutos());

		return suma;

	}

	// metodo para reproducir toda la playlist inicializamos a 0 que seria la
	// primera cancion e incrementamos
	public String reproducirPlaylist() {
		String respuesta = " ";
		for (int i = 0; i < canciones.size(); i++) {
			respuesta = respuesta + canciones.get(i).reproducir();

		}
		return respuesta;
	}

	public Cancion reproducirCancion(int posicion) {
		return canciones.get(posicion);
	}

	// metodo para borrar todo lo que hay dentro del arraylist(canciones de la
	// Playlist)
	public void limpiarPlaylist() {
		canciones.clear();
	}

	public boolean eliminarCancion(int posicion) {
		if (posicion >= 0 && posicion < canciones.size()) {
			canciones.remove(posicion);

		} else
			;
		return true;

	}

	// metodo para encontrar posicion de la cancion por su titulo pasando por todo
	// el arraylist hasta que
	// encuentra una coindidencia con el titulo
	public String encontrarCancionPorTitulo(String nombre) {
		int posicioncancion = -1;
		String busqueda;
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).getTitulo().equals(nombre))
				;
			posicioncancion = i;

		}
		if (posicioncancion == -1) {
			busqueda = "La cancion no existe en la lista";
		} else {
			busqueda = "La cancion " + nombre + " Existe en la posicion: " + posicioncancion;
		}
		return busqueda;
	}

	//
	public String encontrarCancionesPorArtista(String artista) {
		String[] cancionesDelArtista = new String[canciones.size()];
		String busqueda;
		int contador = 0;
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).getArtista().equalsIgnoreCase(artista)) {
				cancionesDelArtista[contador] = canciones.get(i).getTitulo();
				contador += 1;
			}
		}
		busqueda = "Las canciones del artista " + artista + " que hay en la lista son : ";
		for (int i = 0; i < contador; i++) {
			if (i != contador - 1) {
				busqueda += cancionesDelArtista[i] + ", ";
			} else {
				busqueda += cancionesDelArtista[i] + ". ";
			}

		}

		return busqueda;

	}

}
