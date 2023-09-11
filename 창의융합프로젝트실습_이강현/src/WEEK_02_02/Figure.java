package WEEK_02_02;

abstract class Figure {
	abstract void draw();
}

class Triangle extends Figure{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Rectangle extends Figure{
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Oval extends Figure{
	public void draw() {
		System.out.println("타원형을 그린다");
	}
}