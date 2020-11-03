
public class Caneta {
	String model;
	String color;
	float tip;
	int charge;
	boolean capped;
	
	void status() {
		System.out.println("Modelo: " + this.model);
		System.out.println("Uma caneta: " + this.color);
		System.out.println("Ponta: " + this.tip);
		System.out.println("Carga: " + this.charge);
		System.out.println("Está tampada? " + this.capped);
	}
	
	void rabiscar() {
		if (this.capped) {
			System.out.println("ERRO! Não posso rabiscar...");
		} else {
			System.out.println("Estou rabiscando...");
		}
	}
	
	void tampar() {
		this.capped = true;
	}
	
	void destampar() {
		this.capped = false;
	}
}
