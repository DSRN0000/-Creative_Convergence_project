package WEEK_03_03;

public class WEEK_03_03 {
	public static void main(String[ ] args) {
		new WEEK_03_03().run();
	}
	private void run() {
		for (int i =0; i<100; i++) {   //�ν��Ͻ� ������ �Ҹ��� 100 �ݺ�
									   // �� ���� ������ Clean up�� ���ñ�?
			FinalizerDemo finalizerDemo = new FinalizerDemo();
			finalizerDemo.hello(i);
			//System.gc();
		}
	}

}
