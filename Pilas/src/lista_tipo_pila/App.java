package lista_tipo_pila;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		int opcion = 0, nodo = 0;
		Pila pila = new Pila(); // Para acceder hacia los metodos creados en la pila

		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones \n\n" + "1.Insertar Nodo\n"
						+ "2.Eliminar Nodo\n" + "3.¿La pila esta vacia?\n"
						+ "4.¿Cual es el ultimo valor ingresado en la pila?\n" + "5.¿Cuantos nodos tiene la pila?\n"
						+ "6.Vaciar Pila\n" + "7.Mostrar contenido de la pila\n" + "8.Salir\n\n"));
				switch (opcion) {
				case 1:
					nodo= Integer.parseInt(JOptionPane.showInputDialog("Ingresar nodo"));
					pila.InsertarNodo(nodo);

					break;
				case 2:
					if (!pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "La pila ha sido eliminada correctamente" + pila.EliminarNodo());
						
					} else {
					JOptionPane.showMessageDialog(null, "La pila esta vacia");	
					}

					break;

				case 3:
					if (pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "La pila esta vacia");
						
					} else {
						JOptionPane.showMessageDialog(null,"La pila NO esta vacia");
					}

					break;

				case 4:
					if (!pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es " + pila.MostrarUltimoValorIngresado());
						
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta vacia");
					}

					break;
				case 5:
					JOptionPane.showMessageDialog(null, pila.MostrarTamañoDeLaPila() + "nodos.");

					break;
				case 6:
					if (!pila.PilaVacia()) {
						pila.VaciarPila();
						JOptionPane.showMessageDialog(null, "La pila se ha vaciado correctamente");
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta vacia");
					}

					break;
				case 7:
					pila.MostrarValores();

					break;
				case 8:
					opcion=8;

					break;

				default:JOptionPane.showMessageDialog(null, "Error. Intente nuevamente");
					break;
				}

			} catch (NumberFormatException e) {

			}

		} while (opcion != 8);

	}

}
