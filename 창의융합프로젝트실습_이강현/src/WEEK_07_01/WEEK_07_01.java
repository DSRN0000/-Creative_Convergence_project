package WEEK_07_01;

public class WEEK_07_01 extends Calculation{

	public void multiplicaction(int x, int y) {
		z=x*y;
		System.out.println("µÎ ¼öÀÇ °ö¼À : " +z);
	}
	
	public static void main (String[] args) {
		int a =20, b= 10;
		WEEK_07_01 obj = new WEEK_07_01();
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplicaction(a, b);
	}
}
