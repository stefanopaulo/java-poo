
public class Caneta {
	private String model;
	private float tip;
	private boolean tampada;
	private String color;
	
	// método construtor
	public Caneta(String m, String c, float t) {
		this.setModel(m);
		this.setColor(c);
		this.setTip(t);
		this.setTampada(true);
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String m) {
		this.model = m;
	}
	
	public float getTip() {
		return this.tip;
	}
	
	public void setTip(float t) {
		this.tip = t;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModel());
		System.out.println("Ponta: " + this.getTip());
		System.out.println("Cor " + this.getColor());
		System.out.println("Está tampada? " + this.tampada);
	}
}
