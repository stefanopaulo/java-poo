
public class Main {

	public static void main(String[] args) {
		Account c1 = new Account();
		Account c2 = new Account();
		
		c1.openAccount("cp");
		c1.setAccountNumber(1111);
		c1.setOwner("Jubileu");
		c1.deposit(400.0);
		c1.annuity();
		
		c2.openAccount("cc");
		c2.setAccountNumber(2222);
		c2.setOwner("Creusa");
		c2.deposit(500.0);
		c2.withdraw(100.0);
		c2.annuity();
		
		c1.print();
		c2.print();
	}

}
