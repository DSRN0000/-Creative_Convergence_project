package WEEK_09_03;

public class WEEK_09_03 {
	public static void main(String[] args) {
		Rectangle _Rectangle = new Rectangle(10,20);
		Cube _Cube = new Cube(10,20,30);
		System.out.println("_Rectangle�� Rectangle�� ��ü? : " + (_Rectangle instanceof Rectangle));
		System.out.println("_Rectangle�� Cube�� ��ü? : " + (_Rectangle instanceof Cube));
		System.out.println("Cube��  Rectangle�� ��ü? : " + (_Cube instanceof Rectangle));
		System.out.println("_Cube�� Cube�� ��ü? : " + (_Cube instanceof Cube));
		System.out.println("============= �� ��ȯ ���� ===============");
		_Rectangle = new Cube(20,30,40);
		System.out.println("_Rectangle�� Rectangle�� ��ü? : " + (_Rectangle instanceof Rectangle));
		System.out.println("_Rectangle�� Cube�� ��ü? : " + (_Rectangle instanceof Cube));
		System.out.println("Cube��  Rectangle�� ��ü? : " + (_Cube instanceof Rectangle));
		System.out.println("_Cube�� Cube�� ��ü? : " + (_Cube instanceof Cube));
		System.out.println("==========================================");
		System.out.println("_Cube�� Object�� ��ü? : " + (_Cube instanceof Object));
		

	}
}
