package WEEK_03_01;

public class WEEK_03_01 {
	public static void main(String[] args) {
		Box mybox = new Box();
		System.out.println("�ڽ��� ���Ǵ� : " + mybox.getVolume());
		mybox = new Box(10,20,30);
		System.out.println("�ڽ��� ���Ǵ� : " + mybox.getVolume());
	}

}
