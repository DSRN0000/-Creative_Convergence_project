package WEEK_02_03;

public class WEEK_02_03 {
	public static void main (String[] args) {
		polydraw p = new polydraw();
		
		Triangle fg1 = new Triangle();
		Rectangle fg2 = new Rectangle();
		Oval fg3 = new Oval();
		
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);
	}
}
