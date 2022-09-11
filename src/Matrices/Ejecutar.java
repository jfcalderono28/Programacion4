package Matrices;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matriz matrizAleatoria = new Matriz();

		Matriz matrizManual = new Matriz(true);

		Matriz matrizResultado = new Matriz(matrizAleatoria.getX(), matrizManual.getX());

		matrizAleatoria.mostrar();
		System.out.println();
		matrizManual.mostrar();
		System.out.println();
		matrizResultado.mostrar();

		// System.out.println(matriz.getClass().getSimpleName());
		//
		// System.out.println(matriz.getX().getClass().getSimpleName());

	}

}
