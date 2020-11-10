
public class Employee {
	private String forename;
	private String surname;
	private double salary;
	
	public Employee(String forename, String surname, double salary) {
		this.setForename(forename);
		this.setSurname(surname);
		this.setSalary(salary);
	}
	
	public String getForename() {
		return this.forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increase() {
		this.setSalary(this.getSalary() * 1.1);
	}
	
	public double getAnnualSalary() {
		return this.salary * 12.0;
	}
}
