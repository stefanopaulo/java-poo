
public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Igor", "Guimar�es", 3659.00);
		Employee e2 = new Employee("Jo�o", "Paulo", 1490.00);
		
		System.out.printf("Sal�rio anual: R$ %.2f%n", e1.getAnnualSalary());
		System.out.printf("Sal�rio anual: %.2f%n", e2.getAnnualSalary());
		
		e1.increase();
		e2.increase();
		
		System.out.printf("Sal�rio anual mudou para: R$ %.2f%n", e1.getAnnualSalary());
		System.out.printf("Sal�rio anual mudou para: R$ %.2f%n", e2.getAnnualSalary());
		
	}

}
