package WEEK_10_03;

public class Rectangle extends Shape{
	double length, width;
	public Rectangle(String color, double lenth, double width) {
		super(color);
		System.out.println("Rectangle Ŭ���� ������ ȣ��");
		this.length = length;
		this.width = width;
	}
	double area() {return length * width;}
	public String toString() {
		return "�簢�� ������" + super.getCololr() + "�׸��� ������ : " + area();
	}

}
