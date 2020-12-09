
public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		c.reagir("oi garoto");
		c.reagir("vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 30);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(14, 4.5f);
		c.emitirSom();
	}

}
