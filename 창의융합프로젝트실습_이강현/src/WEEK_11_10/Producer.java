package WEEK_11_10;

public class Producer extends Thread{
	private Buffer b;
	public Producer(Buffer blank) {
		b = blank;
	}
	public void run() {
		for (int i=1; i<=5; i++ ) 
			b.put(i);
	}

}
