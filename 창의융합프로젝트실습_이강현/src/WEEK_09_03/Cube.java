package WEEK_09_03;

public class Cube extends Rectangle{
	public int depth;
	public Cube(int width, int height, int depth) {
		//super �����ڸ� ���Ͽ� ���� Ŭ������ ������ ȣ��
		super (width, height);
		this.depth=depth;
	}
	public int computeCubeArea() {
		//super �����ڸ� ���Ͽ� ���� Ŭ������ �޼ҵ� ȣ��
		return super.computeRectangleArea() * depth;
	}

}