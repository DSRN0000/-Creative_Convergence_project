package WEEK_04_03;

public class WEEK_04_03 {
	public static void main (String[] args) {
		BOX _box = new BOX();  //�Ű������� ���� ������ ȣ��
		System.out.println("�Ű� ������ �Է����� ���� �ڽ��� ���� : " + _box.getVolume());
		_box = new BOX(10);   // �Ű������� �ϳ� �ִ� ������ ȣ��
		System.out.println("�Ű� ������ 1���� �Է� �� �ڽ��� ���� : " + _box.getVolume());
		_box = new BOX(10,20);  // �Ű������� �� �� �ִ� ������ ȣ��
		System.out.println("�Ű� ������ 2���� �Է� �� �ڽ��� ���� : " + _box.getVolume());
		_box = new BOX(10,20,30);  // �Ű������� �� �� �ִ� ������ ȣ��
		System.out.println("\n�Ű� ������ 3���� �Է� �� �ڽ��� ���� : " + _box.getVolume());
	}
}
