package WEEK_11_04;

public class WEEK_11_04 {
	public static void main (String[] args) throws InterruptedException {
		System.out.println("========== Tread start ==========");
		new Thread (() ->{
			for (int i = 0 ; i< 5; i++)
				System.out.println(i);
		}).start();
		Thread.sleep(500);
		System.out.println("========== Thread End ========");
	}

}
