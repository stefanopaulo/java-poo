
public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Igor", "Guimarães", 3659.00);
		Employee e2 = new Employee("João", "Paulo", 1490.00);
		
		System.out.printf("Salário anual: R$ %.2f%n", e1.getAnnualSalary());
		System.out.printf("Salário anual: %.2f%n", e2.getAnnualSalary());
		
		e1.increase();
		e2.increase();
		
		System.out.printf("Salário anual mudou para: R$ %.2f%n", e1.getAnnualSalary());
		System.out.printf("Salário anual mudou para: R$ %.2f%n", e2.getAnnualSalary());
		
	}

}
