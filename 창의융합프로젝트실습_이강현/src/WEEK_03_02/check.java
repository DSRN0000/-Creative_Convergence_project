package WEEK_03_02;

public class check {
	private int checkNum;
	public check(int Num) {
		checkNum = Num;
	}
	protected void finalize() throws Throwable{
		System.out.println(checkNum + "�� �ִ� finalize() ����");
	}
}
