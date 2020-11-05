
public class Caneta {
	public String model;
	public String color;
	private float tip;
	protected int charge;
	private boolean capped;
	
	public void status() {
		System.out.println("Modelo: " + this.model);
		System.out.println("Uma caneta: " + this.color);
		System.out.println("Ponta: " + this.tip);
		System.out.println("Carga: " + this.charge);
		System.out.println("Está tampada? " + this.capped);
	}
	
	public void rabiscar() {
		if (this.capped) {
			System.out.println("ERRO! Não posso rabiscar...");
		} else {
			System.out.println("Estou rabiscando...");
		}
	}
	
	public void tampar() {
		this.capped = true;
	}
	
	public void destampar() {
		this.capped = false;
	}
}
