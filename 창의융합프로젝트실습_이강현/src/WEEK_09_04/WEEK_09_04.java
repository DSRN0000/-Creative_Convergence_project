package WEEK_09_04;

public class WEEK_09_04 {
	public static void main(String[] args) {
		AM _Am = new AM();
		_Am.callme();
		System.out.println("_Am.count °ª : " +_Am.count);
		
		_Am = new Bm();
		_Am.callme();
		System.out.println("_Am.count °ª : " +_Am.count);
		
		_Am = new Cm();
		_Am.callme();
		System.out.println("_Am.count °ª : " +_Am.count);
	}

}
