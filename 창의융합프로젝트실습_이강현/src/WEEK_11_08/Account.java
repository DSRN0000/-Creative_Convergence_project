package WEEK_11_08;

public class Account {
	private int total =5000;
	private int index = 1;
	synchronized void withdraw(String name) {
	if(total > 0) {
		System.out.println(name + "����" + index + "��° ������ �Ͽ����ϴ�.");
		total -=1000;
		System.out.println(name + "���� " + index + "��° ���� �Ͽ� ���� �ݾ��� " +total +"�Դϴ�.");
	}else {
		System.out.println(name + "���� ������ �õ� �Ͽ�����, �ݾ� ���� �Դϴ�. ���� �ݾ��� " + total + "�Դϴ�.");
	}
}
	int getTotal() {
		return total;
	}

}
