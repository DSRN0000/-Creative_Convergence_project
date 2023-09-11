package WEEK_06_01;

public class WEEK_06_01 {
	public static void main(String[] args) {
		Subject sub1 = new Subject();
		Subject sub2 = new Subject("운영체제");  // 과목명을 전달하여 인스턴스 생성
		Subject sub3 = new Subject("알고리즘",88); // 과목명과 점수를 전달하여 인스턴스 생성
		
	sub1.setName("창의융합프로젝트");
	sub1.setScore(71);
	
	if(sub1.isValid()) {
		System.out.println("점수가 유효합니다.");
	}else {
		System.out.println("점수가 유효하지 않습니다.");
	}
	
	System.out.println(sub1.getGrade());
	
	sub1.setRangeScore(0, 10);
	
	int[] rg = sub1.getRangeScore();
	
	if(sub1.equalSubject(sub2)) {
		System.out.println("동일한 과목 입니다.");
	}else {
		System.out.println("동일한 과목이 아닙니다.");
	}
	
	
	 if(sub1.gt(sub2)) {
		 System.out.println(sub1.getName() + "의 점수가 더 높습니다.");
	 }
	}
}
