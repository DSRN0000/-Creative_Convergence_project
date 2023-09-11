package WEEK_11_06_5_람다식사용2;

public class WEEK_11_06_5 {

	public static void main(String[] args) throws InterruptedException{
		Runnable _Runnable = () -> {
			for(int i=0; i<5; i++) {
				System.out.println("잘가.");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			}
		};
		new Thread (_Runnable).start();
		for (int i=0; i<5; i++) {
			System.out.println("안녕.");
			Thread.sleep(500);
		}

	}

}
