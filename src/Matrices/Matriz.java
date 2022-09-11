package Matrices;

import java.util.Scanner;

public class Matriz {
	// Variables
	private int x[][] = new int[3][3];
	Scanner entrada = new Scanner(System.in);

	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// Constructores
	public Matriz() {
		rellenarAleatorio();
	}

	public Matriz(boolean pedirDatos) {
		if (pedirDatos == true) {
			pedirDatos();
		}
	}

	public Matriz(int a[][], int b[][]) {
		calcular(a, b);
	}

	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// -------------------------------------------------------//
	// Metodos
	public void rellenarAleatorio() {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public void pedirDatos() {
		int y = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				y++;
				System.out.println("Ingrese el dato: " + y);
				x[i][j] = entrada.nextInt();
			}
		}
	}

	public void calcular(int a[][], int b[][]) {

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int fila[] = traerFila(i, a);
				int columna[] = traerColumna(j, b);

				x[i][j] = calcularCampo(fila, columna);
			}
		}
	}

	public int[] traerFila(int x, int a[][]) {
		int fila[] = { 0, 0, 0 };
		for (int i = 0; i < this.x.length; i++) {
			for (int j = 0; j < this.x.length; j++) {
				if (i == x) {
					fila[j] = a[i][j];
				}

			}
		}
		return fila;
	}

	public int[] traerColumna(int y, int b[][]) {
		int columna[] = { 0, 0, 0 };
		for (int i = 0; i < this.x.length; i++) {
			for (int j = 0; j < this.x.length; j++) {
				if (j == y) {
					columna[i] = b[i][j];
				}

			}
		}
		return columna;
	}

	public int calcularCampo(int x[], int y[]) {
		int resultado = 0;
		for (int i = 0; i < y.length; i++) {
			resultado += x[i] * y[i];
		}
		return resultado;
	}

	public void mostrar() {
		for (int i = 0; i < x.length; i++) {
			System.out.println();
			for (int j = 0; j < x.length; j++) {
				System.out.print("[" + x[i][j] + "]");

			}
		}
	}

	// Getters and Setters
	public int[][] getX() {
		return x;
	}

	public void setX(int[][] x) {
		this.x = x;
	}

}
