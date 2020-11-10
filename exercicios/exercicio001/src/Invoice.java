
public class Invoice {
	private int number;
	private String description;
	private int amount;
	private double price;
	
	public Invoice(int number, String description, int amount, double price) {
		this.setNumber(number);
		this.setDescription(description);
		this.setAmount(amount);
		this.setPrice(price);
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		if (amount < 0) {			
			this.amount = 0;
		} else {
			this.amount = amount;
		}
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0.0;
		} else {			
			this.price = price;
		}
	}
	
	public double getInvoiceAmount() {
		int amount = this.getAmount();
		double price = this.getPrice();
		
		return (double) amount * price;
	}
	
}
