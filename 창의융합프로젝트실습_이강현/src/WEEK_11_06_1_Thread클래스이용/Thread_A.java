package WEEK_11_06_1_Thread클래스이용;

public class Thread_A extends Thread{
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("잘가. ");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
