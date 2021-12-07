package ejercicio1;

import java.util.ArrayList;

public class ShoppingCart{
	static ArrayList<Item> item = new ArrayList<Item>();

	public static void main(String[] args) {
		 ShoppingCart sp = new ShoppingCart();
	       PaymentInterface pp = new PaypalPayment("matiasmena183@yahoo.com ", "12345");
	       PaymentInterface ccp = new CreditCardPayment("Matias","123456678", 432, "07/28");
		//crear objetos y darle sus datos
		Item feltfort = new Item(2, "feltfort", 40);
		Item pan = new Item(3, "pan", 30);
		Item agua = new Item(4, "agua", 10);
		Item milanesas = new Item(5, "milanesas", 5);
		Item facturas = new Item(5, "facturas", 5);
		//Agregar datos al array
		item.add(feltfort);
		item.add(pan);
		item.add(agua);
		item.add(milanesas);
		item.add(facturas);
		//Remover un item
		item.remove(pan);
		//recorrer el array.
		for (Item items : item) {
            System.out.println(items.getUpcCode());
            //Forma de pago
            System.out.println(pp.pagar());
            //Precio
            System.out.println(items.getPrice());
        } 
	}


}
