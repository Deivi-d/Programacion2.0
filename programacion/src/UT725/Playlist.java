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

	public void anyadirCancion(Cancion c) {

		canciones.add(c);

	}

	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);

	}

	public int obtieneTotalCanciones() {

		return canciones.size();

	}

	public void mostrarPlaylist() {

	}

	public int totalDuracionPlaylist() {
		int suma = 0;
		for (Cancion c : canciones)
			suma = (int) (suma + c.getDuracionMinutos());

		return suma;

	}

	public void reproducirPlaylist() {
		Cancion c;
		if (canciones.size() != 0) {
			for (int i = 0; i < canciones.size(); i++) {
				c = canciones.get(i);
			}

		}
	}

	public void reproducirCancion(int posicion) {

	}

	public void limpiarPlaylist() {
		canciones.clear();
	}

	public boolean eliminarCancion(int posicion) {
		if (posicion >= 0 && posicion < canciones.size()) {
			canciones.remove(3);
			return true;
		} else {

			return false;
		}

	}

	public String encontrarCancionPorTitulo(String nombre) {

		return nombre;

	}

	public String encontrarCancionesPorArtista(String artista) {
		return artista;

	}

}
