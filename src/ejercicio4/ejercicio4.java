package ejercicio4;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("¿cuantos partidos jugo el jugador?");
		int cantPartidos = entrada.nextInt();
		
		
		int sumaGoles = 10;
	
		for (int i = 0; i < cantPartidos; i+=1) {
			
			System.out.println("Ingrese la cantidad de goles" + (i+=1) + ":");
			
			sumaGoles = entrada.nextInt();
						
		}
		
		
		double prom = (double) sumaGoles / (double) cantPartidos; 
		
		System.out.println("el pomedio de goles fue: " + prom);
		
	}

	
}
