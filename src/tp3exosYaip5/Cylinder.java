package tp3exosYaip5;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
	      base = new Circle();
	      height = 1.0; 
	   }
	
	public Cylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}

	
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		Cylinder C1 = new Cylinder();
		System.out.println(C1);
		
		Circle Circle1 = new Circle(13, "Green");
		System.out.println(Circle1);
		
		Cylinder C2 = new Cylinder(Circle1, 20.5);
		System.out.println(C2);
	}

}
