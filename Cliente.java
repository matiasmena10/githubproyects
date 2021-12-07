package finalEj5;

public class Cliente extends Persona {

	private String nombreEmpresa;
	private int telefonoDeContacto;

	private Empresa empresa;

	public Cliente(String nombre, int edad, String nombreEmpresa, int telefonoDeContacto) {
		super(nombre, edad);
		this.nombreEmpresa = nombreEmpresa;
		this.telefonoDeContacto = telefonoDeContacto;
	}

	@Override
	public void mostrar() {
		System.out.println("Nombre: " + this.nombre + "\nEdad: " + edad + "\nTelefono de contacto: "
				+ telefonoDeContacto + "\nEmpresa: " + empresa.getNombre());
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getTelefonoDeContacto() {
		return telefonoDeContacto;
	}

	public void setTelefonoDeContacto(int telefonoDeContacto) {
		this.telefonoDeContacto = telefonoDeContacto;
	}

}
