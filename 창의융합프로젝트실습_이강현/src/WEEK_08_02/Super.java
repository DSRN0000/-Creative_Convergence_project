package WEEK_08_02;

public class Super {
	int x = 1000;
	void display() {
		System.out.println("상위 클래스 Super의 display() 메소드입니다.");
	}

}

class Super_child extends Super{
	int x = 2000;
	void display() {
		System.out.println("하위 클래스 Super_child의 display() 메소드입니다.");
	}
	void write() {
		display();
		super.display();
		System.out.println("Super_child 클래스 객체의 x 값은 : " + x );
		System.out.println("Super 클래스 객체의 x 값은 : " + super.x);
	}
}
