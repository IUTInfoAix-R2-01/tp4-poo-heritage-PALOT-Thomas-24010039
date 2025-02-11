package tp3exosYaip6_3;

public interface Movable {
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	
	
	public static void main(String[] args) {
		MovablePoint P1 = new MovablePoint(12, 13, 5, 5);
		System.out.println(P1);
		
		P1.moveDown();
		P1.moveRight();
		System.out.println(P1);
	}
}
