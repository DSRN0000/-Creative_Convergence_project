package WEEK_02_02;

abstract class Figure {
	abstract void draw();
}

class Triangle extends Figure{
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

class Rectangle extends Figure{
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}

class Oval extends Figure{
	public void draw() {
		System.out.println("Ÿ������ �׸���");
	}
}