package WEEK_09_05;

public class Item {
	public int price;

}

class Noodle extends Item{
	public Noodle() {price = 2500;}
	public String toString( ) {return "국수";}
}

class Mixnoodle extends Item {
	public Mixnoodle( ) {price =3000;}
	public String toString() {return "비빔 국수";}
	
}

class Wodong extends Item {
	public Wodong() {price =2500;}
	public String toString() {return "우동";} 
}


