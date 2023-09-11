package WEEK_11_08;

public class WEEK_11_08 {
	public static void main(String[] args) {
		Account _Account = new Account();
		new Customer(_Account, "첫째").start();
		new Customer(_Account, "둘째").start();
		new Customer(_Account, "셋째").start();
		new Customer(_Account, "넷째").start();
		new Customer(_Account, "다섯째").start();
		
	}

}
