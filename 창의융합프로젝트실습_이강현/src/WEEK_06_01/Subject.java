package WEEK_06_01;

public class Subject {
	private int score;
	private String name;
	private int min = 0;
	private int max = 100;
	
	public Subject() {
	
	}
	
	public Subject(String name) {
		this.name = name;
	}
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if (this.score <this.min | this.score>this.max) {
			this.score=-1;
		}else {
				this.score=score;
			}
		}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public boolean isValid(){
		if (this.score>=this.min&&this.score<=this.max){
			return true;
		}else {
			return false;
		}
	
	}
	
	public char getGrade() {
		if (this.score >= max-(max/10)&&this.score <= max) {
			return 'A';
		}else if(this.score >= this.max - (2*max/10) && this.score <= max - (max/10) ) {
			return 'B';
		}else if(this.score >= this.max - (3*max/10) && this.score <= max - (2*max/10) ) {
			return 'C';
		}else if(this.score >= this.max - (4*max/10) && this.score <= max - (3*max/10) ) {
			return 'D';
		}else{
			return 'F';
		}
	}
	
	public void setRangeScore(int i, int j) {
		this.min =i; this.max=j;
		double dscore;
		dscore = (double)this.score * ((double)j/100);
		this.score = (int) dscore;
	}
	
	public int[] getRangeScore(){
		int arr[] = new int [this.max -this.min];
		int count = this.min;
		for (int i = 0; i <arr.length; i++) {
			arr[i] =count++;
		}
		return arr;
	}
	
	public boolean equalSubject(Subject _Subject){
		if (this.name.equals(_Subject.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean gt(Subject _Subject) {
		if (this.score > _Subject.score) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean ge(Subject _Subject) {
		if (this.score >= _Subject.score) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean lt(Subject _Subject) {
		if (this.score < _Subject.score) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean le(Subject _Subject) {
		if (this.score <= _Subject.score) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean eq(Subject _Subject) {
		if (this.score == _Subject.score) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean nq(Subject _Subject) {
		if (this.score != _Subject.score) {
			return true;
		}else {
			return false;
		}
	}
	}


