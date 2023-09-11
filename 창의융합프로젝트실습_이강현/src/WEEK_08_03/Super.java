package WEEK_08_03;

public class Super {
	public  int i1;
	public double d1;
	public Super(int i1) {
		System.out.println("Super(int i1) 생성자 수행");
		this.i1 = i1 * i1;
		System.out.println(i1 + "의 2제곱근은 : "+this.i1);
	}
	public Super(double d1) {
		System.out.println("Super(double d1) 생성자 수행");
		this.d1 = d1 * d1;
		System.out.println(d1 + "의 2제곱은 :" +this.d1);
	}
}
	class Super_child extends Super{
		public Super_child(int i1) {
			super(i1);
			System.out.println("Super_child(int i1) 생성자 수행");
			this.i1 = this.i1 *i1;
			System.out.println(i1+ "의 3제곱은 : "+this.i1);
		}
	
	public Super_child(double d1) {
		super(d1);
		System.out.println("Super_child(double d1) 생성자 수행");
		this.d1 = this.d1 * d1;
		System.out.println(d1 + "의 2제곱은 :" +this.d1);
	}
	}

