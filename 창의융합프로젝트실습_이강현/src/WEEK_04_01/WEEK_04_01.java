package WEEK_04_01;

public class WEEK_04_01 {
	public static void main(String[] args) {
		BOX _box =new BOX();
		System.out.println("�Ű� ������ �Է����� ���� �ڽ��� ���� : " + _box.getVolume());
		_box =new BOX(10);
		System.out.println("�Ű� ������ 1���� �Է� �� �ڽ��� ���� : " + _box.getVolume());
		_box =new BOX(10,20);
		System.out.println("�Ű� ������ 2���� �Է� �� �ڽ��� ���� : " + _box.getVolume());
		_box =new BOX(10,20,30);
		System.out.println("�Ű� ������ 3���� �Է� �� �ڽ��� ���� : " + _box.getVolume());
		
	}
}
