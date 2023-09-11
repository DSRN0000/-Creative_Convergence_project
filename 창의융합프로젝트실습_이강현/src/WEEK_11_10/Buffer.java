package WEEK_11_10;

public class Buffer {
	private int contents;
	private boolean available = false;
	
	public synchronized void put (int value) {
		while (available == true) {
			try {
				wait();
			}catch (InterruptedException e) {
				
			}
		}
		contents = value;
		System.out.println("생산자######## : 생산" + contents);
		notify();
		available = true;
	}
	
	public synchronized int get() {
		while (available ==false) {
			try {
				wait();
			}catch (InterruptedException e) {
				
			}
		}
		System.out.println("소비자########## : 소비 " + contents);
		notify();
		available = false;
		return contents;
	}

}
