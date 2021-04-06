package examen;

public class Artefacto {

	// atributos

	private String nombre;
	private int coste;
	private int poder_daño;
	private int poder_vida;

	// constructor vacio
	Artefacto() {

	}

	public Artefacto(String nombre, int coste, int poder_daño, int poder_vida) {
		// this. indica cual es el atributo y lo otro la variable local
		this.nombre = nombre;
		this.coste = coste;
		this.poder_daño = poder_daño;
		this.poder_vida = poder_vida;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		if(nombre=="") {
			nombre = " Tiene que poner un nombre ";
		}else if (nombre.length() > 100  ) {
			nombre="Ha superado los caracteres posibles";
		}
		
		this.nombre = nombre;
	}

	public int getcoste() {
		return coste;
	}

	public void setCoste(int coste) {
		if(coste = > 0 || <100)
		this.coste = coste;
	}

	public int getPoder_daño() {
		return poder_daño;
	}

	public void setPoder_daño(int poder_daño) {
		this.poder_daño = poder_daño;
	}

	public int getPoder_vida() {
		return poder_vida;
	}

	public void setPoder_vida(int poder_vida) {
		this.poder_vida = poder_vida;
	}

	//metodo toString sobrescrito para mostrar los datos de la clase artefacto
	public String toString() {
		return "nombre" + nombre + "\n coste" + coste + "\n poder_daño" + poder_daño
				+ "\n poder de vida :" + poder_vida;
	}
}
