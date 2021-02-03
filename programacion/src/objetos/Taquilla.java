package objetos;

public class Taquilla {
	//atributos
	private int numero;
	private String codSocio;
	private boolean cerrada;
	//constructor vacio
	public Taquilla() {
		
	}
	//constructores
	public Taquilla(int numero, String socio, boolean cerrada) {
		this.numero=numero;
		this.codSocio=socio;
		this.cerrada=cerrada;
	}
	//getter y setters
	
	public int getnumero() {
		return numero;
	}
	
	public String codSocio() {
		return codSocio;
	}
	public boolean getcerrada() {
		return cerrada;
	}
	
	public void setnumero(int numero) {
		this.numero=numero;
	}
	
	public void setcodSocio(String socio) {
		this.codSocio=socio;
	}
	
	public String toString() {
		String estado = "abierta";
		if(this.cerrada)
			estado = "cerrada";
		return "Taquilla no: "+this.numero +"\nPertenece al socio " + this.codSocio + "\n Estado: "+ estado+"\n";
	}
	
	
}
