package WEEK_09_03;

public class WEEK_09_03 {
	public static void main(String[] args) {
		Rectangle _Rectangle = new Rectangle(10,20);
		Cube _Cube = new Cube(10,20,30);
		System.out.println("_Rectangle¿Ã Rectangle¿« ∞¥√º? : " + (_Rectangle instanceof Rectangle));
		System.out.println("_Rectangle¿Ã Cube¿« ∞¥√º? : " + (_Rectangle instanceof Cube));
		System.out.println("Cube∞°  Rectangle¿« ∞¥√º? : " + (_Cube instanceof Rectangle));
		System.out.println("_Cube∞° Cube¿« ∞¥√º? : " + (_Cube instanceof Cube));
		System.out.println("============= «¸ ∫Ø»Ø ¿Ã»ƒ ===============");
		_Rectangle = new Cube(20,30,40);
		System.out.println("_Rectangle¿Ã Rectangle¿« ∞¥√º? : " + (_Rectangle instanceof Rectangle));
		System.out.println("_Rectangle¿Ã Cube¿« ∞¥√º? : " + (_Rectangle instanceof Cube));
		System.out.println("Cube∞°  Rectangle¿« ∞¥√º? : " + (_Cube instanceof Rectangle));
		System.out.println("_Cube∞° Cube¿« ∞¥√º? : " + (_Cube instanceof Cube));
		System.out.println("==========================================");
		System.out.println("_Cube∞° Object¿« ∞¥√º? : " + (_Cube instanceof Object));
		

	}
}
