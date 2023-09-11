package WEEK_11_06_2_Runnable인터페이스이용;

public class Runnable_A implements Runnable{
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("잘가. ");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
