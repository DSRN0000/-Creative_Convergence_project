package WEEK_11_02;

public class WEEK_11_02 {
	public static void main(String[] args) throws InterruptedException{
		Thread _Thread = new Thread(new Runnable_A());
		System.out.println("========== Thread start==========");
		_Thread.start();
		_Thread.join();		// _Thread�� ���� �� ���� ��ٸ���.
		System.out.println("========== Thread End==========");
	}

}
