package WEEK_10_03;

	public class Circle extends Shape{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle Ŭ���� ������ ȣ��");
		this.radius = radius;
	}
	double area() {return radius * radius *3.14;}
	public String toString() {
		return "�� ������" + super.getCololr() + "�׸��� ������ : " + area();
	}
}
