package WEEK_08_02;

public class Super {
	int x = 1000;
	void display() {
		System.out.println("���� Ŭ���� Super�� display() �޼ҵ��Դϴ�.");
	}

}

class Super_child extends Super{
	int x = 2000;
	void display() {
		System.out.println("���� Ŭ���� Super_child�� display() �޼ҵ��Դϴ�.");
	}
	void write() {
		display();
		super.display();
		System.out.println("Super_child Ŭ���� ��ü�� x ���� : " + x );
		System.out.println("Super Ŭ���� ��ü�� x ���� : " + super.x);
	}
}
