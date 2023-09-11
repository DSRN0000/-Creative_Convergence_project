package WEEK_11_06_3_익명스레드객체화Runnable이용;

public class WEEK_11_06_3 {
	public static void main(String[] args) throws InterruptedException{
		new Thread (new Runnable() {
			public void run() {
				for (int i = 0; i<5; i++) {
					System.out.println("잘가.");
					try {
						Thread.sleep(500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		for (int i=0; i<5; i++) {
			System.out.println("안녕.");
			Thread.sleep(500);
		}
	}
}
