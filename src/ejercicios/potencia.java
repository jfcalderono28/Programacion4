package ejercicios;

import java.util.Scanner;

public class potencia {
	public double potencia() {
		int a, b;
		Scanner scam = new Scanner(System.in);
		System.out.println("Base");
		a = scam.nextInt();

		System.out.println("Exponente");
		b = scam.nextInt();

		double n = 0, resultado = 0;
		if (b < 0) {
			b = b * (-1);
			n = a;
			for (int i = 1; i < b; i++) {
				n = n * a;
			}
			resultado = 1 / n;

		} else if (b == 0) {
			resultado = 1;
		} else {

			n = a;
			for (int i = 1; i < b; i++) {
				n = n * a;
			}
			resultado = n;
		}

		return resultado;

	}
}
