
public abstract class Animal {
	private float peso;
	private int membros;
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getMembros() {
		return membros;
	}
	
	public void setMembros(int membros) {
		this.membros = membros;
	}
}
