package UT622;

public class Libro {
	// Atributos
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	// Constructor vacio (por defecto)
	public Libro() {
	}

	// Constructor con parametros
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		// this. indica cual es el atributo y lo otro la variable local
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	// geters y setters
	public String gettituto() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getautor() {
		return autor;
	}

	public void setautor(String autor) {
		this.autor = autor;
	}

	public int getejemplares() {
		return ejemplares;
	}

	public void setejemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getprestados() {
		return prestados;
	}

	public void setprestados(int prestados) {
		this.prestados = prestados;
	}

	// metodos para realizar el prestamos de un libro
	public boolean prestamo() {
		boolean prestado = true;
		if (prestados < ejemplares) {
			prestados++;
		} else {
			prestado = false;
		}
		return prestado;
	}

	public boolean devolucion() {
		boolean devuelto = true;
		if (prestados == 0) {
			devuelto = false;
		} else {
			prestados--;
		}
		return devuelto;

	}
	//metodo toString sobrescrito para mostrar los datos de la clase libro
	public String toString() {
		return "Titulo" + titulo + "\n autor" + autor + "\n ejemplares" + ejemplares
				+ "\n prestados" + prestados;
	}

}
