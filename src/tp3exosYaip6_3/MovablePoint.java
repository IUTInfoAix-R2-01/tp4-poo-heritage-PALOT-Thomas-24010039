package tp3exosYaip6_3;

import tp3exosYaip6_2.Movable;

public class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	@Override
	public void moveUp() {
		y -= ySpeed;
	}
	
	@Override
	public void moveDown() {
		y += ySpeed;
	}
	
	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
	
	@Override
	public void moveRight() {
		x += xSpeed;
	}
	
}
