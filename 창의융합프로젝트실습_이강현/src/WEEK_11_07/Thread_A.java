package WEEK_11_07;

public class Thread_A extends Thread{
	public Thread_A(String name) {
		setName(name);
	}
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println(getName() + " -> ");
			try {
				sleep(100);
			}catch (InterruptedException e ) {
				
			}
		}
	}
}
