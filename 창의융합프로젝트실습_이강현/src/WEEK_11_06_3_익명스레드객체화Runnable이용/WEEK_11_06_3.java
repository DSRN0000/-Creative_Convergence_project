package WEEK_11_06_3_�͸����尴üȭRunnable�̿�;

public class WEEK_11_06_3 {
	public static void main(String[] args) throws InterruptedException{
		new Thread (new Runnable() {
			public void run() {
				for (int i = 0; i<5; i++) {
					System.out.println("�߰�.");
					try {
						Thread.sleep(500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		for (int i=0; i<5; i++) {
			System.out.println("�ȳ�.");
			Thread.sleep(500);
		}
	}
}
