package finalEj5;

public class Directivo extends Empleado {

	private String categoria;

	public Directivo(String nombre, int edad, double sueldoBruto, String categoria) {
		super(nombre, edad, sueldoBruto);
		this.categoria = categoria;
	}

	@Override
	public void mostrar() {
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nCategoria: " + categoria);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
