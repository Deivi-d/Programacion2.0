package UT725;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

	// ATRIBUTOS privados

	private ArrayList<Cancion> canciones; // canciones (de tipo arraylist)
	private String Nombre; // nombre (de tipo String)

	// Constructor por defecto (vacio)

	public Playlist() {
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	}

	// Constructor con parametros
	public Playlist(String nombre) {
		this.setNombre(nombre); // parametro nombre
		ArrayList<Cancion> canciones = new ArrayList<Cancion>(); // inicializo arraylist

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

	public void anyadirCancion(String cancion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre de la cancion");
		String nombreCancion = sc.next();
		System.out.println("Dime el artista o grupo");
		String artista  = sc.next();
		System.out.println("¿Cuantos minutos dura la cancion?");
		int minutos = sc.nextInt();
		canciones.add(new Cancion());

	}

	public int obtieneCancion(int posicion) {
		return posicion;

	}

	public ArrayList<Cancion> obtieneTotalCanciones() {
		canciones.size();
		System.out.println("Hay un total de " + canciones + " canciones en la Playlist");
		return canciones;
	
	}

	public void mostrarPlaylist() {

	}

	public int totalDuracionPlaylist() {
		return 0;

	}

	public void reproducirPlaylist() {

	}

	public void reproducirCancion(int posicion) {

	}

	public void limpiarPlaylist() {

	}

	public boolean eliminarCancion(int posicion) {
		return false ;

	}

	public String encontrarCancionPorTitulo(String nombre) {
		return nombre;

	}

	public String encontrarCancionesPorArtista(String artista) {
		return artista;

	}

}
