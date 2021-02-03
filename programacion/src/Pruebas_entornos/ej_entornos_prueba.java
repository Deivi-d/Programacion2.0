/**
 * 
 */
package Pruebas_entornos;

/**
 * @author david
 *
 */
public class ej_entornos_prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nif unnif = new Nif();
		Nif minif = new Nif(51010628,'D');
		System.out.println(minif.getDni()+ "_"+minif.getLetra());
		minif.setLetra('D');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		
	}

}
