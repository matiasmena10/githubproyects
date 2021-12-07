package finalEj5;

public class Empleado extends Persona {

	private double sueldoBruto;

	private Empresa empresa;

	public Empleado(String nombre, int edad, double sueldoBruto) {
		super(nombre, edad);
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public void mostrar() {
		System.out.println(
				"Nombre: " + nombre + "\nEdad: " + edad + "\nSueldo bruto: " + sueldoBruto + "\nEmpresa: " + empresa.getNombre());
	}

	public double calcularSalarioNeto() {
		double resultado = sueldoBruto - (sueldoBruto * 0.17);
		return resultado;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

}
