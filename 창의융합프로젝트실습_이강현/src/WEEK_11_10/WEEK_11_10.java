package WEEK_11_10;

public class WEEK_11_10 {
	public static void main(String[] args) {
		Buffer buff = new Buffer();
		Producer p1 = new Producer(buff);
		Consumer c1 = new Consumer(buff);
		p1.start();
		c1.start();
	}

}
