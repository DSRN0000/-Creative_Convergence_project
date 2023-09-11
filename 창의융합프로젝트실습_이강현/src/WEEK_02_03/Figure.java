package WEEK_02_03;

abstract class Figure {
	abstract void draw();
}

class Triangle extends Figure{
	protected void draw() {
		System.out.println("다형성 : 삼각형을 그린다");
	}
}
class Rectangle extends Figure{
	protected void draw() {
		System.out.println("다형성 : 사각형을 그린다");
	}
}
class Oval extends Figure{
	protected void draw() {
		System.out.println("다형성 : 타원형을 그린다");
	}
}
