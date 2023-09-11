package WEEK_11_01;

public class WEEK_11_01 {
	public static void main(String[] args) throws InterruptedException{
		Thread_A thread1 = new Thread_A();
		System.out.println("========== Thread start==========");
		thread1.start();
		
		System.out.println("========== Thread End==========");
	}

}
