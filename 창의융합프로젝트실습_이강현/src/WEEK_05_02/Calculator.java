package WEEK_05_02;

public class Calculator {
	void cal(char c , int ... num) {
		if (num.length<2) {
			System.out.println("�ּ��� �ǿ����� (������)�� 2�� �̻� �Է� �Ǿ�� �մϴ�.");
		}
		
		int result = num[0];
	
		if (c=='+') {
			for(int i =1; i<num.length; i++ ) {
				result+=num[i];
			}	
		}else if (c=='-') {
			for (int i =1; i< num.length; i++) {
				result-=num[i];
			}
		}else if (c=='*') {
			for (int i =1; i< num.length; i++) {
				result*=num[i];
			}
		}else if (c=='/') {
			for (int i =1; i< num.length; i++) {
				result/=num[i];
			}
		}
		
		System.out.println(result);
	}
}
