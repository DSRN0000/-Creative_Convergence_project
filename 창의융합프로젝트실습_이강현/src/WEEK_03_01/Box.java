package WEEK_03_01;

public class Box {
	private int width;
	private int height;
	private int depth;
	
	public Box() {   //ºóÄ­
 		width =height=depth =1;    
	
	}
	
	
	public Box(int w, int h, int d ) {
		width = w;
		height = h;
		depth = d;
	}

	public int getVolume() {
		return width * height * depth;
	}
}
