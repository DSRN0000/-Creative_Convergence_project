package WEEK_09_04;

public class AM {
	int count = 1;
	void callme() {
		System.out.println("Am의 callme() 실행, count 값 : " + count);
	}
}
class Bm extends AM{
	int count = 2;
	void callme() {
		System.out.println("Bm의 callme() 실행, count 값 : " + count);
	}
	
}
class Cm extends AM{
	int count = 3;
	void callme() {
		System.out.println("Cm의 callme() 실행, count 값 : " + count);
	}
	
}
