package WEEK_11_09;

public class WEEK_11_09 {
	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("������", car, "����").start();
		new CarThread("������", car, "�λ�").start();
		new CarThread("������", car, "����").start();
	}

}
