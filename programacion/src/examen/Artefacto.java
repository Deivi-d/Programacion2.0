package examen;

public class Artefacto {

	// atributos

	private String nombre;
	private int coste;
	private int poder_da�o;
	private int poder_vida;

	// constructor vacio
	Artefacto() {

	}

	public Artefacto(String nombre, int coste, int poder_da�o, int poder_vida) {
		// this. indica cual es el atributo y lo otro la variable local
		this.nombre = nombre;
		this.coste = coste;
		this.poder_da�o = poder_da�o;
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

	public int getPoder_da�o() {
		return poder_da�o;
	}

	public void setPoder_da�o(int poder_da�o) {
		this.poder_da�o = poder_da�o;
	}

	public int getPoder_vida() {
		return poder_vida;
	}

	public void setPoder_vida(int poder_vida) {
		this.poder_vida = poder_vida;
	}

	//metodo toString sobrescrito para mostrar los datos de la clase artefacto
	public String toString() {
		return "nombre" + nombre + "\n coste" + coste + "\n poder_da�o" + poder_da�o
				+ "\n poder de vida :" + poder_vida;
	}
}
