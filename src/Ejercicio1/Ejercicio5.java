package Ejercicio1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuantos dias Registramos?");
		int diasRegistrados = entrada.nextInt();

		double temperatura = 0;

		double temMax = 0;

		for (int i = 0; i < diasRegistrados; i++) {
			
			if (temperatura > temMax) {
				

				
			}
			
			double prom = (int) diasRegistrados / (double) temperatura;

			System.out.println("la temperatura registrada fue: " + prom);
		}

	}

}
