package sec04.exam07_conditional;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85; // 숫자 바꿔보면 grade가 다르게 나옴
		char grade = (score>90)? 'A' : ((score >80) ?'B' : 'C');
		
		System.out.println(grade);
	}

}
