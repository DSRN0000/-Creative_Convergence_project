package WEEK_10_03;

public class Rectangle extends Shape{
	double length, width;
	public Rectangle(String color, double lenth, double width) {
		super(color);
		System.out.println("Rectangle 클래스 생성자 호출");
		this.length = length;
		this.width = width;
	}
	double area() {return length * width;}
	public String toString() {
		return "사각형 색상은" + super.getCololr() + "그리고 면적은 : " + area();
	}

}
