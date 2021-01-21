package Ejercicio1_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);
		String nombre;
		Persona uno= new Persona("Amelia");
	
		System.out.printf("Esta persona se llama %s%n", uno.getNombre());
		System.out.print("Escribele un nombre nuevo: ");
		nombre=keyboard.next();
		uno.setNombre(nombre);
		System.out.printf("Ahora se llama %s", uno.getNombre());
	}

}
