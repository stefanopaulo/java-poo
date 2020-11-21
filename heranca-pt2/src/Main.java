
public class Main {

	public static void main(String[] args) {
		// Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Tecnico t1 = new Tecnico();
		Professor p1 = new Professor();
		
		v1.setNome("João");
		v1.setIdade(23);
		v1.setSexo("M");
		
		a1.setNome("Pedro");
		a1.setIdade(27);
		a1.setSexo("M");
		a1.setMatricula(1111);
		a1.setCurso("Informática");

		a1.pagarMensalidade();
		
		b1.setNome("Maria");
		b1.setIdade(20);
		b1.setSexo("F");
		b1.setBolsa(12.5f);
		b1.setMatricula(2222);
		b1.setCurso("Enfermagem");
		
		b1.pagarMensalidade();
		
		t1.setNome("Joaquim");
		t1.setIdade(16);
		t1.setSexo("M");
		t1.setMatricula(3333);
		t1.setCurso("Informática");
		
		t1.pagarMensalidade();
		t1.praticar();
		
		p1.setNome("Danilo");
		p1.setIdade(46);
		p1.setSexo("M");
		p1.setSalario(3200f);
		p1.receberAumento(352.65f);
		
		System.out.println(p1.getSalario());
	}

}
