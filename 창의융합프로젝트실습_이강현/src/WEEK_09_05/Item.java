package WEEK_09_05;

public class Item {
	public int price;

}

class Noodle extends Item{
	public Noodle() {price = 2500;}
	public String toString( ) {return "����";}
}

class Mixnoodle extends Item {
	public Mixnoodle( ) {price =3000;}
	public String toString() {return "��� ����";}
	
}

class Wodong extends Item {
	public Wodong() {price =2500;}
	public String toString() {return "�쵿";} 
}


