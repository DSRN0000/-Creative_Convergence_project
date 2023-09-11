package WEEK_04_03;

public class BOX {
	private int width, height, depth;
	public BOX() {
		this(1,1,1);
		System.out.println("0");
	}
	public BOX(int width) {
		this(width,1,1);
		System.out.println("1");
	}
	public BOX(int width, int height) {
		this(width,height,1);
		System.out.println("2");
	}
	public BOX(int width, int height, int depth) {
		this.width=width; this.height=height;  this.depth=depth;
		System.out.println("3\t");
	}
	public int getVolume() {
		return width * height * depth;
	}
}
