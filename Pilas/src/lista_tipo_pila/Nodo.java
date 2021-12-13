package lista_tipo_pila;

public class Nodo {
	int informacion;
	Nodo siguiente; //Apuntador al siguiente nodo
	
	//Constructor
	
	Nodo(int valor) {
		this.informacion= valor; //Se guarda el valor dentro de la variable informacion 
		siguiente = null;
		
		
	}

}
