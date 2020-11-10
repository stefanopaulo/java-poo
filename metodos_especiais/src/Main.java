
public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
		c1.status();
		
		Caneta c2 = new Caneta("AAA", "Laranja", 0.5f);
		c2.setTampada(false);
		c2.status();
	}

}
