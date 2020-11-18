
public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	
	public void makeBirthday() {
		this.setAge(this.getAge() + 1);
	}

	public void status() {
		System.out.println("--- Dados da Pessoa ---");
		System.out.println("Nome: " + this.getName());
		System.out.println("Idade: " + this.getAge());
		System.out.println("Gênero: " + this.getGender());
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
