package tp3exosYaip4;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Animal A1 = new Animal("Joe");
		System.out.println(A1);

	}
}
