package WEEK_11_06_1_Thread클래스이용;

public class WEEK_11_06 {
	public static void main (String[] args) throws InterruptedException{
		Thread_A thread1 = new Thread_A();
		thread1.start();
		for (int i = 0; i<5; i++) {
			System.out.println("안녕.");
			Thread.sleep(500);
		}
	}
}
