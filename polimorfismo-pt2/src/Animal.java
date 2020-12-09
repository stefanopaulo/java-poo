
public abstract class Animal {
	protected float peso;
	protected int membros;
	
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
