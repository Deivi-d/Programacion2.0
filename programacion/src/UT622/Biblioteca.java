package UT622;

public class Biblioteca {

	// Atributos
	private String alta_libro;
	private String cosulta_libro;
	private String baja_libro;
	private String prestamo_libro;
	private String salir;

	// constructor vacio
	public Biblioteca() {

	}

	// constructor con parametros
	public Biblioteca(String alta_libro, String consulta_libro, String prestamo_libro, String salir) {
		this.alta_libro = alta_libro;
		this.cosulta_libro = consulta_libro;
		this.prestamo_libro = prestamo_libro;
		this.salir = salir;
	}

	// geters y setters
	public String getalta_libro() {
		return alta_libro;
	}

	public void setalta_libro(String alta_libro) {
		this.alta_libro = alta_libro;
	}

	public String getaconsulta_libro() {
		return alta_libro;
	}

	public void setconsulta_libro(String consulta_libro) {
		this.cosulta_libro = consulta_libro;
	}

	public String getprestamo_libro() {
		return prestamo_libro;
	}

	public void setprestamo_libro(String prestamo_libro) {
		this.prestamo_libro = prestamo_libro;
	}

	public String getsalir() {
		return salir;
	}

	public void setsalir(String salir) {
		this.salir = salir;
	}

}
