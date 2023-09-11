package WEEK_09_03;

public class Cube extends Rectangle{
	public int depth;
	public Cube(int width, int height, int depth) {
		//super 연산자를 통하여 상위 클래스의 생성자 호출
		super (width, height);
		this.depth=depth;
	}
	public int computeCubeArea() {
		//super 연산자를 통하여 상위 클래스의 메소드 호출
		return super.computeRectangleArea() * depth;
	}

}