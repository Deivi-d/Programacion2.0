/**
 * 
 */
package objetos;

/**
 * @author david
 *reserva taquilla
 */
public class ejemplo_taquillas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taquilla[] taquillas = new Taquilla [10];
		
		for(int i=0;i<taquillas.length;i++) {
			taquillas[i] = new Taquilla(i+1,"Sin asignar",false);
			
		}
		
		System.out.println(taquillas[0].getnumero());
		System.out.println(taquillas[3].getnumero());
		System.out.println(taquillas[9].getnumero());
		System.out.println(taquillas[2].getcodigoSocio());
		System.out.println("La taquilla 4 esta: " + taquillas[4].getcerrada());
		
		if(!taquillas[4].getcerrada()) {
			taquillas[4].getcerrada() = true;
		}
		
		System.out.println("La taquillas 4 esta: "+taquillas[4].cerrada);
		System.out.println("Taquilla " + taquillas[4]);
	}

}
