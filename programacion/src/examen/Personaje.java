package examen;

import java.util.ArrayList;

import examen.Artefacto;

public class Personaje {

	// atributos

	String nombre;
	int monedas;
	int vida;
	int poder_daño;
	private ArrayList<Artefacto> listadeartefactos; // listadeartefactos (de tipo arraylist)

	Personaje() {
		listadeartefactos = new ArrayList<Artefacto>();
	}

	public Personaje(String nombre, int monedas, int poder_daño) {
		// this. indica cual es el atributo y lo otro la variable local
		this.nombre = nombre;
		this.monedas = monedas;
		this.poder_daño = poder_daño;
	}
	
	
}
