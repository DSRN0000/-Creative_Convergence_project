package WEEK_11_06_5_���ٽĻ��2;

public class WEEK_11_06_5 {

	public static void main(String[] args) throws InterruptedException{
		Runnable _Runnable = () -> {
			for(int i=0; i<5; i++) {
				System.out.println("�߰�.");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			}
		};
		new Thread (_Runnable).start();
		for (int i=0; i<5; i++) {
			System.out.println("�ȳ�.");
			Thread.sleep(500);
		}

	}

}
