package WEEK_11_10;

public class Consumer extends Thread {
	private Buffer b;
	public Consumer (Buffer blank) {
		b = blank;
	}
	public void run() {
		int value = 0;
		for (int i = 1; i<=5; i++)
			value = b.get();
	}
}
