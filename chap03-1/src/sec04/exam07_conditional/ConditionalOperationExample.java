package sec04.exam07_conditional;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85; // ���� �ٲ㺸�� grade�� �ٸ��� ����
		char grade = (score>90)? 'A' : ((score >80) ?'B' : 'C');
		
		System.out.println(grade);
	}

}
