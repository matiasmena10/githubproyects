package finalEj5;

public class App {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Rodrigo Sanchez", 42, 75000);
		Cliente cliente1 = new Cliente("Damian Perez", 35, "Samsung", 1155243465);
		Directivo directivo1 = new Directivo("Ramiro Rodriguez", 56, 85000, "B");
		Empresa empresa1 = new Empresa("Samsung");
		Empresa empresa2 = new Empresa("Apple");

		empleado1.setEmpresa(empresa1);
		cliente1.setEmpresa(empresa2);

		empleado1.mostrar();
		cliente1.mostrar();
		directivo1.mostrar();

	}

}
