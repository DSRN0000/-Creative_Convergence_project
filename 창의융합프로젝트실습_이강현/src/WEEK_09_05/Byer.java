package WEEK_09_05;

public class Byer {
	private int money;
	public Byer(int money)  {this.money = money;}
	public void buy (Item _Item, int count) {
		System.out.println(_Item + "��(��)" +count + "�� ���ְ� �Ծ����ϴ�.");
		money = money- _Item.price*count;
		System.out.println("���� ���� �� : " + money);
	}

}
