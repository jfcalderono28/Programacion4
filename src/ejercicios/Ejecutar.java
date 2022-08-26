package ejercicios;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;

		while (n != 2) {
			Menu menu = new Menu();
			n = menu.mostrarMenu();

			if (n == 1) {
				potencia ejem = new potencia();
				System.out.println(ejem.potencia());
			}

		}

	}

}
