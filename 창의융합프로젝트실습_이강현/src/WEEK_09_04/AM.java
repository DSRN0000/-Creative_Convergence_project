package WEEK_09_04;

public class AM {
	int count = 1;
	void callme() {
		System.out.println("Am�� callme() ����, count �� : " + count);
	}
}
class Bm extends AM{
	int count = 2;
	void callme() {
		System.out.println("Bm�� callme() ����, count �� : " + count);
	}
	
}
class Cm extends AM{
	int count = 3;
	void callme() {
		System.out.println("Cm�� callme() ����, count �� : " + count);
	}
	
}
