package Clase7;
import java.util.Scanner;
public class Palabra {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        String cad1;
        System.out.print("Ingrese la pralabra deseada:");
        cad1=teclado.nextLine();
        
        System.out.println(cad1+ " convertido a may�sculas es "+cad1.toUpperCase());
        System.out.println(cad1+ " convertido a min�sculas es "+cad1.toLowerCase());      
	}
		
}
