
public class Tecnico extends Aluno {
	private int registroProfissional;
	
	public void praticar() {
		System.out.println(this.getNome() + " est� praticando o conte�do do curso de " + this.getCurso());
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
