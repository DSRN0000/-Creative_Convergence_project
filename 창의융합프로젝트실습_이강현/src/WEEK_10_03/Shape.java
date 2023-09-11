package WEEK_10_03;

abstract public class Shape {
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	public String getCololr() {return color;}

}
