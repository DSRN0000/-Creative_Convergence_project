package WEEK_11_06_2_Runnable�������̽��̿�;

public class Runnable_A implements Runnable{
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("�߰�. ");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
