package WEEK_11_05;

public class WEEK_11_05 {
	public static void main (String[] args) throws InterruptedException{
		System.out.println("========== Thread start =========");
		Runnable _Runnable = () -> {
			for (int i = 0; i < 5; i++)
				System.out.println(i);
		};
		new Thread (_Runnable).start();
		Thread.sleep(500);
		System.out.println("======== Thread End ===========");
	}

}
