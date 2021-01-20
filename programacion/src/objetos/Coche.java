/**
 * 
 */
package objetos;

/**
 * @author david
 *
 */
public class Coche {
	
	//CARACTERISTICAS COMUNES DE UN COCHE
	//private (modificador de acceso)
	private int ruedas;
	
	private	int largo;
	
	private	int ancho;
	  
	private	int motor;
	
	private	int peso;
	
	//METODO CONSTRUCTOR(SE ENCARGA DE DAR UN ESTADO INICIAL A NUESTRO OBJETO) SE LLAMARA SIEMPRE IGUAL QUE LA CLASE
	
	public Coche(){
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	//METODO GETTER
	
	public String dime_largo() {
		
		return "El largo del coche es " + largo;
	}
}
