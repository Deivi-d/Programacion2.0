package UT725;

public class Cancion {

	// Atributos privados

	private String Titulo;
	private String Artista;
	private float DuracionMinutos;

	// Constructor vacio o por defecto
	public Cancion() {

	}

	// constuctor con parametros
	public Cancion(String titulo, String artista, float duracionminutos) {
		this.Titulo = titulo;
		this.Artista = artista;
		this.DuracionMinutos = duracionminutos;

	}

	// getter y setter

	public String getTitulo() {
		return Titulo;

	}

	public void setTitulo(String Titulo) {

	}

	public String getArtista() {
		return Artista;
	}

	public void setArtista(String Artista) {

	}

	public float getDuracionMinutos() {
		return DuracionMinutos;
	}

	// metodo toString sobrescrito para mostrar los datos de la clase cancion

	public String toString() {
		return "Titulo" + Titulo + "\n Artista" + Artista + "\n Duracion" + DuracionMinutos;
	}

	// metodos para realizar el prestamos de un libro
	
	public boolean reproducir() {
		return false;
	
		}
	}


