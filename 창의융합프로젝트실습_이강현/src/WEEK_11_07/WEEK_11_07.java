package WEEK_11_07;

public class WEEK_11_07 {
	public static void main(String[] args) {
		Thread_A t1 = new Thread_A("´À±ßÇÑ");
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread_A t2 = new Thread_A("±ÞÇÑ");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
