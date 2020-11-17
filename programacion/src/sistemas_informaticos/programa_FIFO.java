/**
 * 
 */
package sistemas_informaticos;

import java.util.Scanner;

/**
 * @author david
 *
 */
public class programa_FIFO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//tiempo de ejecucio, llegada y retorno
		
		int t_llegada1,t_llegada2,t_espera1,t_espera2,t_ratorno1,t_retorno2,
		t_ejecucion1,t_ejecucion2;
		
		System.out.println("introduce el tiempo de llegada del p1:");
		t_llegada1=sc.nextInt();
		
		System.out.println("introduce el tiempo de llegada del p2:");
		t_llegada2=sc.nextInt();
		
		System.out.println("introduce el tiempo de ejecucion del p1:");
		t_ejecucion1=sc.nextInt();
		
		System.out.println("introduce el tiempo de ejecucion del p2:");
		t_ejecucion2=sc.nextInt();
		
		if(t_llegada1<t_llegada2) {
			
			
			int procesoActivo=1;
		}
		
	}

}
