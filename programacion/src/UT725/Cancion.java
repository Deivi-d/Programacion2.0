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

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getArtista() {
		return Artista;
	}

	public void setArtista(String artista) {
		this.Artista = artista;
	}

	public float getDuracionMinutos() {
		return DuracionMinutos;
	}

	public void setDuracionMinutos(float duracionminutos) {
		this.DuracionMinutos = duracionminutos;
	}

	// metodo toString sobrescrito para mostrar los datos de la clase cancion

	public String toString() {
		return this.getTitulo() + this.getArtista() + this.getDuracionMinutos();
	}

	// metodos para realizar el prestamos de un

	public String reproducir() {
		return "Reproduciendo..." + Titulo;

	}
}
