package ejercicio1;

public class PaypalPayment implements PaymentInterface {

	private String emailId;
	private String password;
	
	PaypalPayment(String emailId,String password) {
		this.emailId=emailId;
		this.password=password;
	}
	
	
	
	public String getEmailId() {
		return emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String pagar() {
		return "Paying with PayPal";
		
	}

}
