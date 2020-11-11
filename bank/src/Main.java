
public class Main {

	public static void main(String[] args) {
		// Account c1 = new Account();
		
		// c1.openAccount("cc");
		// c1.setOwner("Alfredo");
		// c1.deposit(400.0);
		
		// c1.annuity();
		// c1.closeAccount();
		
		// c1.deposit(200);
		// c1.closeAccount();
		
		// System.out.println(c1.getBalance());
		
		Account c2 = new Account();
		
		c2.openAccount("cp");
		c2.deposit(500);
		c2.annuity();
		c2.withdraw(200);
		c2.withdraw(430);
		c2.annuity();
		// c2.closeAccount();
		c2.deposit(20);
		c2.closeAccount();
		
		System.out.println(c2.getBalance());
	}

}
