package ejercicio1;

public class CreditCardPayment implements PaymentInterface {
	
	private String nombre;
	private String cardNumber;
	private int cvv;
	private String fechaDeExpiracion;
	
	CreditCardPayment(String nombre,String cardNumber,int cvv,String fechaDeExpiracion) {
		this.cardNumber=cardNumber;
		this.nombre=nombre;
		this.cvv=cvv;
		this.fechaDeExpiracion=fechaDeExpiracion;
		
	}
	
	
	
	@Override
	public String pagar() {
		return "Paying with Credit Card";
		
	}
	
	

}
