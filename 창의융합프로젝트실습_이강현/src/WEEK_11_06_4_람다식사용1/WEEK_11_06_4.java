package WEEK_11_06_4_람다식사용1;

public class WEEK_11_06_4 {
	public static void main(String[] args) throws InterruptedException{
		new Thread(()->{
			for(int i=0; i<5; i++) {
				System.out.println("잘가.");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			}
			
		}).start();
		for (int i=0; i<5; i++) {
			System.out.println("안녕.");
			Thread.sleep(500);
		}
	}

}
