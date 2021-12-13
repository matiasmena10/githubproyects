package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
	private Nodo UltimoValorIngresado;
	int tamano;
	String Lista = "";

	Pila() {
		UltimoValorIngresado = null;
		tamano = 0; // Tamaño de la pila

	}

	// Metodo Pila Vacia

	public boolean PilaVacia() {
		return UltimoValorIngresado == null;
	}

	// Metodo para insertar un Nodo en la pila

	public void InsertarNodo(int nodo) { // Se trabajara con datos de tipo entero
		Nodo nuevo_nodo = new Nodo(nodo); // Objeto tipo Nodo
		nuevo_nodo.siguiente = UltimoValorIngresado;
		UltimoValorIngresado = nuevo_nodo;
		tamano++; // Aumentara la lista
	}

	// Metodo para eliminar un Nodo de la pila

	public int EliminarNodo() {
		int auxiliar = UltimoValorIngresado.informacion;
		UltimoValorIngresado = UltimoValorIngresado;
		tamano--;
		return auxiliar;
	}

	// Metodo para conocer cual es el ultimo valor ingresado

	public int MostrarUltimoValorIngresado() {
		return UltimoValorIngresado.informacion;
	}

	// Metodo para mostrar el tamaño de la pila
	public int MostrarTamañoDeLaPila() {
		return tamano;
	}

	// Metodo para vaciar la pila

	public void VaciarPila() {
		while (!PilaVacia()) {
			EliminarNodo();

		}
	}

	//Metodo para mostrar el contenido de la pila
	
	public void MostrarValores() {
		Nodo recorrido = UltimoValorIngresado;
		while (recorrido!=null) {
			Lista+=recorrido.informacion + "\n";
			recorrido= recorrido.siguiente;

		}
		JOptionPane.showMessageDialog(null, Lista);
		Lista="";
	}
}
