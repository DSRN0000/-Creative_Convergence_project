package WEEK_04_01;

public class BOX {
	private int width, height, depth;
	public BOX() {
		width = height = depth = 1;
	}
	
	public BOX(int w) {
		width=height=depth=1;
	}
	
	public BOX(int w, int h) {
		width = w; height=h; depth=1;
	}
	
	public BOX(int w, int h, int d) {
		width=w; height=h; depth=d;
	}
	
	public int getVolume() {
		return width*height*depth;
	}

}
