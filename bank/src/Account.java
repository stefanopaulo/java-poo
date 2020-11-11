
public class Account {
	public int accountNumber;
	protected String type;
	private String owner;
	private double balance;
	private boolean status;
	
	public Account() {
		this.setStatus(false);
		this.setBalance(0.0);
	}
	
	public void openAccount(String type) {
		if (this.getStatus()) {
			System.out.println("Essa conta já está aberta!");
			System.out.println();
		} else {
			this.setStatus(true);
			this.setType(type);
			
			if (type == "cc") {
				this.setBalance(50.0);
			}
			
			if (type == "cp") {
				this.setBalance(150.0);
			}
		}
	}
	
	public void closeAccount() {
		if (this.getStatus() == false) {
			System.out.println("Essa conta já está fechada!");
		} else {
			if (this.getBalance() > 0) {
				System.out.println("Ainda há saldo em conta!");
				System.out.println("Sacando R$ " + this.getBalance() + "...");
				withdraw(this.getBalance());
				System.out.println("Conta fechada.");
				this.setStatus(false);
				System.out.println();
			}
			
			if (this.getBalance() < 0) {
				System.out.println("A conta está com saldo negativo! Deposite R$ " + (-1 * this.getBalance()) + " para prosseguir.");
				System.out.println();
			}
		}
	}
	
	public void deposit(double value) {
		if (this.getStatus()) {
			this.setBalance(this.getBalance() + value);
		} else {
			System.out.println("Essa conta está fechada!");
			System.out.println();
		}
	}
	
	public void withdraw(double value) {
		if (this.getStatus()) {
			if (this.getBalance() >= value) {
				this.setBalance(this.getBalance() - value);
			} else {
				System.out.println("Não é possível realizar o saque para este valor.");
				System.out.println();
			}
		} else {
			System.out.println("Essa conta está fechada!");
			System.out.println();
		}
	}
	
	public void annuity() {
		if (this.getStatus()) {
			if (this.getType() == "cc") {
				this.setBalance(this.getBalance() - 12);
			}
			
			if (this.getType() == "cp") {
				this.setBalance(this.getBalance() - 20);
			}
		} else {
			System.out.println("Essa conta está fechada!");
			System.out.println();
		}
	}
	
	public void print() {
		System.out.println("Dados da conta:");
		System.out.println("Dono(a): " + this.getOwner());
		System.out.println("Número: " + this.getAccountNumber());
		System.out.println("Saldo: " + this.getBalance());
		if (this.getStatus()) {
			System.out.println("Status: ABERTA");
		} else {
			System.out.println("Status: FECHADA");
		}
		System.out.println();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
