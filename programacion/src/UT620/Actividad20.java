/**
 * 
 */
package UT620;

/**
 * @author david
 *
 */
public class Actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona usuario = new Persona();
		usuario.setNombre("David");
		System.out.println(usuario .getNombre());
		usuario.setApellidos("Sánchez-camacho Aldana");
		System.out.println(usuario.getApellidos());
		usuario.setAnio(1999);
		System.out.println(usuario.getAnioNacimiento());
		usuario.setMes(7);
		System.out.println(usuario.getMesNacimiento());
		usuario.setDia(6);
		System.out.println(usuario.getDiaNacimiento());
		usuario.setSexo('H');
		System.out.println(usuario.getSexo());
		
		usuario.saludar();
		System.out.println(usuario.mostrarEdad());
		
		Persona invento = new Persona("PEPE", "lopez garcia", 8000, 34, -3, 'G');
		invento.saludar();
	}
	

}
