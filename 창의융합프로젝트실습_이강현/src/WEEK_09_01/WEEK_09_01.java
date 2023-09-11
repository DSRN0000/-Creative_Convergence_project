package WEEK_09_01;

public class WEEK_09_01 {
	public static void main(String[] args) {
		//상위 클래스 형의 객체 변수에 하위 클래스의 객체를 생성하여 배정
		Rectangle _Rectangle = new Cube(10,20,30);
		// 객체변수를 통하여 상위 클래스의 메소드 호출
		System.out.println("넓이는 : " + _Rectangle.computeRectangleArea());
	}

}
