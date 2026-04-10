package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	
			System.out.println("Ingrese el nombre de usuario:");
		
		String nombreUsuario = entrada.next(); 
		
		System.out.println("Ingrese la cantidad de misiones:");
		int cantidadMisiones = entrada.nextInt(0);
		
		String nivelGamer;
		
		if (cantidadMisiones >= 1 && cantidadMisiones <= 5) {
			//Novato
			nivelGamer = "Novato";
			
		} else if (cantidadMisiones >= 1 && cantidadMisiones <= 5) {
			//Principiante
			nivelGamer = "Promesa";
		
		} else if (cantidadMisiones >=6 && cantidadMisiones <=15) {
			//Experimentado
			nivelGamer = "Experimentado";
		
		}else if (cantidadMisiones >15) {
			//Veterano
			nivelGamer = "Veterano";
		
		}else {
			
			nivelGamer = "Valor incorrecto";
		}
			
		System.out.println("nombreUsuario" + nombreUsuario);
		System.out.println("cantidadMisiones" + cantidadMisiones);
		System.out.println("nivelGamer" + nivelGamer);
		
			
		
			
		
			
			
		
		
		}
}
