package WEEK_03_03;

public class FinalizerDemo {
	private int nIndex;
	
	protected void finalize() throws Throwable{
		System.out.println(nIndex + "번째 Clean up");
	}
	public void hello(int index) {
		nIndex = index;
		System.out.println(index + "번째 hello");
	}

}
