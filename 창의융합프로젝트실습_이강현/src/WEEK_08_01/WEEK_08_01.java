package WEEK_08_01;

public class WEEK_08_01 {
		public static void main (String[] args) {
			Super_child  _Super_child = new Super_child();
			System.out.println("객체 sb2에 들어 있는 x,y값 : " + _Super_child.x+_Super_child.y);
			//sb2.super.x 이와 같은 사용은 허용 안됨.
			System.out.println("객체 sb2에 들어 있는 xx값 : " + _Super_child.xx);
			System.out.println("객체 sb2에 들어 있는 yy값 : " + _Super_child.yy);
			
		}

}
