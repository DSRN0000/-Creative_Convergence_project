package WEEK_11_09;

public class WEEK_11_09 {
	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("»«Áö¸®", car, "¼­¿ï").start();
		new CarThread("¹®µÕÀÌ", car, "ºÎ»ê").start();
		new CarThread("²¤²¤ÀÌ", car, "±¤ÁÖ").start();
	}

}
