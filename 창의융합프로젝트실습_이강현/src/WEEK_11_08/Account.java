package WEEK_11_08;

public class Account {
	private int total =5000;
	private int index = 1;
	synchronized void withdraw(String name) {
	if(total > 0) {
		System.out.println(name + "님이" + index + "번째 인출을 하였습니다.");
		total -=1000;
		System.out.println(name + "님이 " + index + "번째 인출 하여 남은 금액은 " +total +"입니다.");
	}else {
		System.out.println(name + "님이 인출을 시도 하였으나, 금액 부족 입니다. 남은 금액은 " + total + "입니다.");
	}
}
	int getTotal() {
		return total;
	}

}
