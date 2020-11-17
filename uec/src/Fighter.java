
public class Fighter {
	private String name;
	private String nationality;
	private int age;
	private float height;
	private float weight;
	private String category;
	private int victories;
	private int defeats;
	private int ties;
	
	public Fighter(String name, String nationality, int age, float height, float weight, int victories, int defeats, int ties) {
		this.setName(name);
		this.setNationality(nationality);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setVictories(victories);
		this.setDefeats(defeats);
		this.setTies(ties);
	}
	
	public void toPresent() {
		if (this.getWeight() < 52.2 || this.getWeight() > 120.2) {
			System.out.println("Esse lutador não está em nenhuma categoria.");
		} else {
			System.out.println("--- Apresentação do lutador ---");
			System.out.println("Nome: " + this.getName());
			System.out.println("Nacionalidade: " + this.getNationality());
			System.out.println("Idade: " + this.getAge());
			System.out.println("Altura: " + this.getHeight());
			System.out.println("Peso: " + this.getWeight());
			System.out.println("Categoria: " + this.getCategory());
			System.out.println("-------------------------------");
			System.out.println();
		}
	}
	
	public void status() {
		if (this.getWeight() < 52.2 || this.getWeight() > 120.2) {
			System.out.println("Esse lutador não está em nenhuma categoria.");
		} else {			
			System.out.println("--- Cartel ---");
			System.out.println("Vitórias: " + this.getVictories() + " | " + "Derrotas: " + this.getDefeats() + " | " + "Empates: " + this.getTies());
			System.out.println("--------------");
			System.out.println();
		}
	}
	
	public void winFight() {
		this.setVictories(this.getVictories() + 1);
	}
	
	public void loseFight() {
		this.setDefeats(this.getDefeats() + 1);
	}
	
	public void tieFight() {
		this.setTies(this.getTies() + 1);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
		
		this.setCategory();
	}
	
	public String getCategory() {
		return category;
	}
	
	private void setCategory() {
		if (this.getWeight() < 52.2) {
			this.category = "Inválido";
		} else if (this.getWeight() <= 70.3) {
			this.category = "Peso leve";
		} else if (this.getWeight() <= 83.9) {
			this.category = "Peso médio";
		} else if (this.getWeight() <= 120.2) {
			this.category = "Peso pesado";
		} else {
			this.category = "Inválido";
		}
	}
	
	public int getVictories() {
		return victories;
	}
	
	public void setVictories(int victories) {
		this.victories = victories;
	}
	
	public int getDefeats() {
		return defeats;
	}
	
	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	public int getTies() {
		return ties;
	}
	
	public void setTies(int ties) {
		this.ties = ties;
	}
}
