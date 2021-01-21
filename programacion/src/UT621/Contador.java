/**
 * 
 */
package UT621;

/**
 * @author david
 *
 */
public class Contador {

	//ATRIBUTO
	public int cont;
	
	//CONSTRUCTOR VACIO (POR DEFECTO)
	public Contador() {
		
	}
	
	//CONSTRUCTORES
	public Contador (int cont) {
		setContador(cont);
	}
	
	public Contador(Contador c1) {
		setContador(c1.getContador());
	}
	
	//METODOS
	public int getContador() {
		return cont;
	}
	public void setContador(int cont) {
		if(cont<0)
			cont=0;
		this.cont=cont;		
	}
	
	public void incrementar() {
		cont++;
	}
	public void decrementar() {
		cont--;
		if(cont<0)
			cont=0;
	}
	
}
