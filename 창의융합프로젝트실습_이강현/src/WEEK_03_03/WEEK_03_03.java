package WEEK_03_03;

public class WEEK_03_03 {
	public static void main(String[ ] args) {
		new WEEK_03_03().run();
	}
	private void run() {
		for (int i =0; i<100; i++) {   //인스턴스 생성과 소멸을 100 반복
									   // 몇 번을 돌려야 Clean up이 나올까?
			FinalizerDemo finalizerDemo = new FinalizerDemo();
			finalizerDemo.hello(i);
			//System.gc();
		}
	}

}
