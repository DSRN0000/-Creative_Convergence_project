package WEEK_09_05;

public class Byer {
	private int money;
	public Byer(int money)  {this.money = money;}
	public void buy (Item _Item, int count) {
		System.out.println(_Item + "을(를)" +count + "개 맛있게 먹었습니다.");
		money = money- _Item.price*count;
		System.out.println("현재 남은 돈 : " + money);
	}

}
