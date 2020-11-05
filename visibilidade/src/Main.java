
public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.model = "Bic cristal";
		c1.color = "Azul";
		// c1.tip = 0.5f;
		c1.charge = 80;
		// c1.capped = false;
		c1.destampar();
		
		c1.rabiscar();
		
		c1.status();
	}

}
