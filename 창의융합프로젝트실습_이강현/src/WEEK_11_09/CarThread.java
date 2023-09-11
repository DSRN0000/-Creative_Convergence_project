package WEEK_11_09;
import java.util.Random;
public class CarThread extends Thread {
	private String who;
	private SharedCar Car;
	private String where;
	
	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.Car = car;
		this.where = where;
	}
	public void run() {
		Car.drive(who,where);
	}

}
