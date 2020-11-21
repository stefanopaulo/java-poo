
public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p1.setIdade(22);
		p1.setSexo("M");
		
		p2.setNome("Maria");
		p2.setIdade(32);
		p2.setSexo("F");
		
		p3.setNome("Cláudio");
		p3.setIdade(56);
		p3.setSexo("M");
		
		p4.setNome("Fabiana");
		p4.setIdade(36);
		p4.setSexo("F");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		p3.receberAumento(375.50f);
		p4.mudarTrabalho();
		p3.fazerAniversario();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
