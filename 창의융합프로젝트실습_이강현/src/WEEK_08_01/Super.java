package WEEK_08_01;

public class Super {
	public int x = 500;
	public int y = 1000;
}

class Super_child extends Super{
	public String x = "�������б� â������������Ʈ";
	public String xx = x + super.x;
	public String yy = ""+y + super.y;
}