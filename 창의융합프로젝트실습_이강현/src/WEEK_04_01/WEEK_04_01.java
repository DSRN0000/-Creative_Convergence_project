package WEEK_04_01;

public class WEEK_04_01 {
	public static void main(String[] args) {
		BOX _box =new BOX();
		System.out.println("매개 변수를 입력하지 않은 박스의 부피 : " + _box.getVolume());
		_box =new BOX(10);
		System.out.println("매개 변수를 1개만 입력 한 박스의 부피 : " + _box.getVolume());
		_box =new BOX(10,20);
		System.out.println("매개 변수를 2개만 입력 한 박스의 부피 : " + _box.getVolume());
		_box =new BOX(10,20,30);
		System.out.println("매개 변수를 3개만 입력 한 박스의 부피 : " + _box.getVolume());
		
	}
}
