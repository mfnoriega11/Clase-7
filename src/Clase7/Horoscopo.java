package Clase7;


import java.util.ArrayList;

public class Horoscopo {
	
	  public static void main(String[] args) {
	        ArrayList<String> horoscopo= new ArrayList<>();
	        
	       
	        horoscopo.add("Si quieres llevar a cabo una tarea complicada todo se relovera");
	        horoscopo.add("Si un Amigo te juzga, es que se lo est�s poniendo muy dif�cil.");
	        horoscopo.add("Nadie siente las cosas con tanta profundidad como tu ");
	        horoscopo.add("Soy el t�pico ser  triste, sensible, insatisfecho.");
	        horoscopo.add("Si tienes un proyecto entre manos, no hay mejor socio que un familiar.");
	        horoscopo.add("No sabes lo que es la paciencia hasta que no pierdes los papeles con un amigo");
	        horoscopo.add("Ac�ptalo, 99% del tiempo tu tendr�s la raz�n.");
	        horoscopo.add("T�pico de ti : hacer ver que les sorprende un rumor que ellos mismos han empezado.");
	        horoscopo.add("Escorpio, sin su cara de pocos amigos, no ser�a Escorpio... pero eso es lo que le hace encantador.");
	        horoscopo.add("Veo que est�s triste... deja que te cuente un chiste.");
	        horoscopo.add("Yo respeto todas las opiniones... excepto la tuya, la tuya es muy est�pida.");
	         
	      
	         double nro2= Math.random()*10;

	         nro2 = Math.floor(nro2);
	      		
	         System.out.println(horoscopo.get((int)nro2));               
	         

	    
	   
	    }
	   

}
