package WEEK_04_02;

public class WEEK_04_02 {
	public static void main(String[] args) {
		BOX _box = new BOX(10,20,30);
		int nvol = _box.nwidth * _box.nheight * _box.ndepth;
		System.out.println("박스의 부피(정수 매개변수) : " + nvol);
		_box = new BOX(10.5, 20.5, 30.5);
		double dvol = _box.dwidth * _box.dheight * _box.ddepth;
		System.out.println("박스의 부피(실수 매개변수) : " + dvol);
		_box = new BOX(10, 20, 30.5);
		
		
		System.out.println("nwidth : " + _box.nwidth);
		System.out.println("nwidth : " + _box.nheight);
		System.out.println("nwidth : " + _box.ndepth);
		
		System.out.println("nwidth : " + _box.dwidth);
		System.out.println("nwidth : " + _box.dheight);
		System.out.println("nwidth : " + _box.ddepth);
		
		dvol = _box.dwidth * _box.dheight * _box.ddepth;
		System.out.println("박스의 부피(정수와 실수 혼합 매개변수) : " +dvol);
	}

}
