/**
 * 
 */
package UT622;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=9;
		int id=0;
		 String titulo, autor;
		 int ejemplares, prestados;
		Scanner entrada=new Scanner(System.in);
		ArrayList<Libro> biblioteca=new ArrayList<Libro>();
		//Libro libro1 = new Libro(" la casa de la pradera", " Chiquito de la calzada", 10, 9);
		//biblioteca.add(libro1);
		//Libro libro2 = new Libro("el ultimo mohicano ", " kiko rivera", 5, 4);
		//biblioteca.add(libro2);
		Libro nuevolibro= new Libro();
		while(menu!=0) {
			System.out.println("\n0.Salir\n1.Alta libro\n2.Consulta libro\n3. baja libro\n4.prestamos de libro");
			System.out.println("elige una opcion:");
			menu=entrada.nextInt();
				if(menu==1) {
					aņadirLibro(biblioteca);
				}
				else if(menu==2) {
					for(int i=0;i<biblioteca.size();i++){
					System.out.print("id libro: "+i);
					System.out.print("\ntitulo del libro: "+biblioteca.get(i).gettituto());
					System.out.print("\nautor del libro: "+biblioteca.get(i).getautor());
					System.out.print("\nnumero de ejemplares:"+biblioteca.get(i).getejemplares());
					System.out.print("\nnumero de prestados: "+biblioteca.get(i).getprestados()+"\n\n");
					}	
				}
				else if(menu==3) {
					 System.out.print("dime el id del libro que desea eliminar: ");
					id=entrada.nextInt();
					biblioteca.remove(id);
					}
				else if(menu==4) {
					int id_max=biblioteca.size();
					int y=0;
					while(y==0) {
						 System.out.print("dime el id del libro que desea coger prestado, tiene q ser menor que "+id_max+ " : ");
						 id=entrada.nextInt();
						if(id<id_max)
							y=1;
						
			
					}

					 nuevolibro=biblioteca.get(id);
					 if (nuevolibro.prestamo()) {
						 System.out.println("Se ha prestado el libro " + nuevolibro.gettituto());
						 } else {
						 System.out.println("No quedan ejemplares del libro " + nuevolibro.gettituto() + " para prestar");
						 }
					 
				}
				}
			}
	private static void aņadirLibro(ArrayList<Libro>l) {
		Scanner entrada=new Scanner(System.in);
		Libro nuevolibro=new Libro();
		System.out.print("Introduce titulo: ");
		nuevolibro.settitulo(entrada.next()); 
		 System.out.print("Introduce autor: ");
		 nuevolibro.setautor(entrada.next());  
		 System.out.print("Numero de ejemplares: ");
		 nuevolibro.setejemplares(entrada.nextInt()); 
		 l.add(nuevolibro);
		 System.out.print("has aņadido un libro nuevo.");
	}

	
	}


