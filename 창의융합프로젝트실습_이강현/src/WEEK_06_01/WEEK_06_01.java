package WEEK_06_01;

public class WEEK_06_01 {
	public static void main(String[] args) {
		Subject sub1 = new Subject();
		Subject sub2 = new Subject("�ü��");  // ������� �����Ͽ� �ν��Ͻ� ����
		Subject sub3 = new Subject("�˰���",88); // ������ ������ �����Ͽ� �ν��Ͻ� ����
		
	sub1.setName("â������������Ʈ");
	sub1.setScore(71);
	
	if(sub1.isValid()) {
		System.out.println("������ ��ȿ�մϴ�.");
	}else {
		System.out.println("������ ��ȿ���� �ʽ��ϴ�.");
	}
	
	System.out.println(sub1.getGrade());
	
	sub1.setRangeScore(0, 10);
	
	int[] rg = sub1.getRangeScore();
	
	if(sub1.equalSubject(sub2)) {
		System.out.println("������ ���� �Դϴ�.");
	}else {
		System.out.println("������ ������ �ƴմϴ�.");
	}
	
	
	 if(sub1.gt(sub2)) {
		 System.out.println(sub1.getName() + "�� ������ �� �����ϴ�.");
	 }
	}
}
