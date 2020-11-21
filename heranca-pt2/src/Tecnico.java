
public class Tecnico extends Aluno {
	private int registroProfissional;
	
	public void praticar() {
		System.out.println(this.getNome() + " está praticando o conteúdo do curso de " + this.getCurso());
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
