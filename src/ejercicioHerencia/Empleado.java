package ejercicioHerencia;

public class Empleado extends ValorHoras {
	private String nombre;
	private int cedula;
	private int telefono;

	public Empleado(String nombre, int cedula, int telefono) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;

		pedirHoras();
		valorDeLaHora();
		calcular(getNumeroHoras());

	}

	public void MostrarInformaciónEmpleado() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Cedula: " + cedula);
		System.out.println("Telefono: " + telefono);
		System.out.println("Número de horas trabajadas: " + getNumeroHoras());
		System.out.println("Valor de la hora : " + getValorHora());
		System.out.println("Total: " + getTotal());

	}

}
