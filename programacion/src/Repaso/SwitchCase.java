/**
 * 
 */
package Repaso;

/**
 * @author david
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner (System.in); 

        System.out.println("escribe un numero del 1 al 7:"); 

        int dia = sc.nextInt(); 

        switch(dia) { 

            case 1: 

                System.out.println("Domingo"); 

            break; 

            case 2: 

                System.out.println("Sabado"); 

                break; 

            case 3: 

                System.out.println("Viernes"); 

                break; 

            case 4: 

                System.out.println("Jueves"); 

                break; 

            case 5: 

                System.out.println("Miercoles"); 

                break; 

                case 6: 

                    System.out.println("Martes"); 

                    break; 

                case 7: 

                    System.out.println("Lunes"); 

                    break; 

                 

                    default: 

                        System.out.println("no hay"); 

                         

                        sc.close(); 

                     

        } 

     

     

    } 

  

} 
	


