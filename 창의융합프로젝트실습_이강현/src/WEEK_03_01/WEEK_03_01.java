package WEEK_03_01;

public class WEEK_03_01 {
	public static void main(String[] args) {
		Box mybox = new Box();
		System.out.println("박스의 부피는 : " + mybox.getVolume());
		mybox = new Box(10,20,30);
		System.out.println("박스의 부피는 : " + mybox.getVolume());
	}

}
