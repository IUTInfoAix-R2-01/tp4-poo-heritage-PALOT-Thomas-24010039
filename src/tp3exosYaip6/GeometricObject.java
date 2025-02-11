package tp3exosYaip6;

public interface GeometricObject {
	public double getArea();
	public double getPerimeter();
	
	
	
	public static void main(String[] args) {
		Circle C1 = new Circle(10.0);
		System.out.println(C1);
		System.out.println(C1.getArea());
		System.out.println(C1.getPerimeter());
		
		Rectangle R1 = new Rectangle(15, 20);
		System.out.println(R1);
		System.out.println(R1.getArea());
		System.out.println(R1.getPerimeter());
	}
}
