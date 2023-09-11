package WEEK_02_03_Homework;

public class WEEK_02_03 {
	public static void main(String[] args) {
		polydraw p = new polydraw();
		
		Figure fg1 = new Triangle();
		Figure fg2 = new Rectangle();
		Figure fg3 = new Oval();
		
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);
	}
}
