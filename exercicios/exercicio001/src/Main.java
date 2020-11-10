
public class Main {

	public static void main(String[] args) {
		Invoice i = new Invoice(1, "Computer", 3, 1499.99);
		
		System.out.println(i.getInvoiceAmount());
	}

}
