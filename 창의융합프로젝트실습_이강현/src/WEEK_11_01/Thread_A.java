package WEEK_11_01;

public class Thread_A extends Thread{
	public void run() {
		for (int i = 0; i<5; i++)
			System.out.println(i);
	}

}
