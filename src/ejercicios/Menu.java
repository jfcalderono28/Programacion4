package ejercicios;

import java.util.Scanner;

public class Menu {
	public int mostrarMenu() {

		System.out.println("----------------------------");
		System.out.println("1-------------------Potencia");
		System.out.println("2----------------------Salir");

		Scanner scam = new Scanner(System.in);
		int n = scam.nextInt();

		return n;
	}
}
