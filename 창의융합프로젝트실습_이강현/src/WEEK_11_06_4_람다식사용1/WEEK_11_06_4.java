package WEEK_11_06_4_���ٽĻ��1;

public class WEEK_11_06_4 {
	public static void main(String[] args) throws InterruptedException{
		new Thread(()->{
			for(int i=0; i<5; i++) {
				System.out.println("�߰�.");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			}
			
		}).start();
		for (int i=0; i<5; i++) {
			System.out.println("�ȳ�.");
			Thread.sleep(500);
		}
	}

}
