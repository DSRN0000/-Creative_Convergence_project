package WEEK_04_03;

public class WEEK_04_03 {
	public static void main (String[] args) {
		BOX _box = new BOX();  //매개변수가 없는 생성자 호출
		System.out.println("매개 변수를 입력하지 않은 박스의 부피 : " + _box.getVolume());
		_box = new BOX(10);   // 매개변수가 하나 있는 생성자 호출
		System.out.println("매개 변수를 1개만 입력 한 박스의 부피 : " + _box.getVolume());
		_box = new BOX(10,20);  // 매개변수가 두 개 있는 생성자 호출
		System.out.println("매개 변수를 2개만 입력 한 박스의 부피 : " + _box.getVolume());
		_box = new BOX(10,20,30);  // 매개변수가 세 개 있는 생성자 호출
		System.out.println("\n매개 변수를 3개만 입력 한 박스의 부피 : " + _box.getVolume());
	}
}
