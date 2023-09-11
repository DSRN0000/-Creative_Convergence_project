package WEEK_05_02;

public class WEEK_05_02 {
	public static void main (String[] args) {
		Calculator _Calculator = new Calculator();
		
		_Calculator.cal('+', 2,3);
		_Calculator.cal('+', 2,3,5);
		_Calculator.cal('+', 2,3,5,10);
		
		_Calculator.cal('-', 10,2);
		_Calculator.cal('-', 10,2,3);
		_Calculator.cal('-', 10,2,3,5);
		
		_Calculator.cal('*', 10,2);
		_Calculator.cal('*', 10,2,3);
		
		_Calculator.cal('/', 10,2);
		_Calculator.cal('/', 10,2,3);
	}

}
