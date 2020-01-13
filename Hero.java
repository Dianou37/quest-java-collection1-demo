
public class Hero {
	
	//attributs
	private String name;
	private int age;
	
	//constructeurs
	public Hero(String name, int age) {
		this.setName(name);
		this.setAge(age);
		
	}
	
	//Getters / Setters
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

}
