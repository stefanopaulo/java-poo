
public class Main {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c1 = new Canguru();
		Cachorro c2 = new Cachorro();
		Tartaruga t = new Tartaruga();
		Peixe g = new Peixe();
		
		m.setPeso(85.3f);
		m.setMembros(4);
		
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		r.setPeso(1.5f);
		r.setMembros(4);
		
		System.out.println();
		r.locomover();
		r.alimentar();
		r.emitirSom();
		
		p.setPeso(0.5f);
		p.setMembros(0);
		
		System.out.println();
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolhas();
		
		a.setPeso(2.5f);
		a.setMembros(2);
		
		System.out.println();
		a.locomover();
		a.alimentar();
		a.emitirSom();
		a.fazerNinho();
		
		c1.setPeso(100f);
		c1.setMembros(4);
		c1.setCorPelo("Marrom");
		
		System.out.println();
		c1.locomover();
		c1.alimentar();
		c1.emitirSom();
		
		c2.setPeso(5.5f);
		c2.setMembros(4);
		c1.setCorPelo("Marrom");
		
		System.out.println();
		c2.locomover();
		c2.alimentar();
		c2.emitirSom();
		c2.enterrarOsso();
		c2.abanarRabo();
		
		t.setPeso(30f);
		t.setMembros(4);
		
		System.out.println();
		t.locomover();
		t.alimentar();
		t.emitirSom();
		
		g.setPeso(0.5f);
		g.setMembros(0);
		g.setCorEscama("Dourado");
		
		System.out.println();
		g.locomover();
		g.alimentar();
		g.emitirSom();
		System.out.println("Cor da escama: " + g.getCorEscama());
	}

}
