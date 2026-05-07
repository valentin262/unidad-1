package Ejercicio1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opciones = 0;
		int puntMax = 0;
		int punt1 = 0;

		do {
			System.out.println("Bienvenido");
			System.out.println("1- Ingrese la cantidad de puntos");
			System.out.println("2- ingrese el puntaje maximo");
			System.out.println("3- salida");

			opciones = entrada.nextInt();

			switch (opciones) {

			case 1:
				System.out.println("Ingrese su puntaje");
				punt1 = entrada.nextInt();

				if (punt1 > puntMax) {

					puntMax = punt1;
					
				System.out.println("La cantidad total de puntaje fue " + puntMax);

				}
				break;
				
			case 2:

				System.out.println("Mostrar su mejor puntaje " + puntMax);

				break;
			case 3:
				System.out.println("Saliste del menu");
				break;

			default:

				System.out.println("Valor incorrecto");

			}

		} while (opciones != 3);

	}

}
