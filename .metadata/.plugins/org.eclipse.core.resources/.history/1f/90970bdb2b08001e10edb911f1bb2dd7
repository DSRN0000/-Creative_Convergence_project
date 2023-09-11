package WEEK_11_06_2_Runnable인터페이스이용;

public class WEEK_11_06_2 {
	public static void main(String[] args) throws InterruptedException{
		Thread thread1 = new Thread(new Runnable_A());
		Thread _thread = new Thread(thread1);
		_thread.start();
		for (int i = 0; i<5; i++) {
			System.out.println("안녕.");
			Thread.sleep(500);
		}
	}
}
