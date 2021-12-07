package ejercicio1;

public class Item  {
	private int id;
	private String upcCode;
	private double price;
	
	Item(int id, String upcCode, double price) {
		this.id=id;
		this.upcCode=upcCode;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
