package WEEK_09_03;

public class Rectangle {
	public int width;
	public int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int computeRectangleArea() {
		return width * height;
	}
}
