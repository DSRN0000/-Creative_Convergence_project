package WEEK_02_03;

abstract class Figure {
	abstract void draw();
}

class Triangle extends Figure{
	protected void draw() {
		System.out.println("������ : �ﰢ���� �׸���");
	}
}
class Rectangle extends Figure{
	protected void draw() {
		System.out.println("������ : �簢���� �׸���");
	}
}
class Oval extends Figure{
	protected void draw() {
		System.out.println("������ : Ÿ������ �׸���");
	}
}
