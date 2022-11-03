package ejercicioHerencia;

import java.util.Scanner;

public class Hora {
	Scanner scanner = new Scanner(System.in);
	private int numeroHoras = 0;

	public void pedirHoras() {
		System.out.println("Número de horas trabajadas: ");
		this.numeroHoras = scanner.nextInt();

	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
}
