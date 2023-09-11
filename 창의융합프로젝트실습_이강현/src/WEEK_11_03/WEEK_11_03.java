package WEEK_11_03;

public class WEEK_11_03 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("========= Thread start ===========");
		new Thread (new Runnable() {
			public void run() {
				for ( int i = 0 ; i <5; i++)
					System.out.println(i);
			}
		}).start();
		Thread.sleep(500);
		System.out.println("============ Thread End =============");
	}

}
