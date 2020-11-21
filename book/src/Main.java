
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Maria", 33, "F");
		Book b1 = new Book("Orientação a Objetos", "Thiago Leite e Carvalho", 245, p1);
		
		p1.status();
		b1.details();
		
		b1.open();
		b1.flipThrough(100);
		b1.advancePage();
		b1.advancePage();
		b1.backPage();
		
		System.out.println(b1.getCurrentPage());
	}

}
