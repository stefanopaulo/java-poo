
public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		c1.color = "azul";
		c1.tip = 0.5f;
		c1.tampar();
		
		c2.model = "Bic cristal";
		c2.color = "preta";
		c2.tip = 0.7f;
		c2.charge = 90;
		c2.destampar();
		
		c1.status();
		c1.rabiscar();
		
		System.out.println();
		
		c2.status();
		c2.rabiscar();
	}

}
