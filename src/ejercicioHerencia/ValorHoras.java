package ejercicioHerencia;

import java.util.Scanner;

public class ValorHoras extends Hora {
	private double total = 0;
	private double valorHora = 0;

	Scanner scan = new Scanner(System.in);

	public void calcular(int nHoras) {
		if (nHoras < 41) {
			this.total = valorHora * nHoras;

		} else if (nHoras >= 40 && nHoras <= 48) {
			this.total = valorHora * 40;
			nHoras -= 40;
			double temp = valorHora * 1.20;
			this.total += temp * nHoras;
			// 3960

		} else if (nHoras > 48) {
			this.total = valorHora * 40;
			double temp = valorHora * 1.20;
			this.total += temp * 8;
			nHoras -= 48;

			temp = valorHora * 1.40;
			this.total += temp * nHoras;

		}

	}

	public void valorDeLaHora() {
		System.out.println("Valor de la hora trabajada: ");
		this.valorHora = scan.nextInt();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
