package tp3exosYaip4;

public class Dog extends Mammal{
	public Dog (String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog("toto");
		System.out.println(d1);
		d1.greets();
		Dog d2 = new Dog("TOTO2");
		d1.greets(d2);
	}
}
