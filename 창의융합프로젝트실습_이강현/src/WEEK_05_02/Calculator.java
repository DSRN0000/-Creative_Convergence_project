package WEEK_05_02;

public class Calculator {
	void cal(char c , int ... num) {
		if (num.length<2) {
			System.out.println("최소한 피연산자 (데이터)가 2개 이상 입력 되어야 합니다.");
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
