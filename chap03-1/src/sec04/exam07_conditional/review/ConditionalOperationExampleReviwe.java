package sec04.exam07_conditional.review;

public class ConditionalOperationExampleReviwe {
	public static void main(String[] args){
		int point = 98;
		char result1 = (point>80) ? 'A' : 'B';
		System.out.println(result1);
		
		char result2 = (point>70) ? ((point > 90) ? 'O' : 'S') : 'A'; //������ ��� ����. true ���� ������� �־ �����غ�
		
		System.out.println(result2);
		
	}
//���: 3���� �ǿ����ڸ� ���� ��. ������� 1,2,3 �ǿ����ڶ�� �ϸ� 1���� ���̳� ���̽óĿ� ���� 2,3�� �ǿ����ڷ� �Ѿ �� �� �� 2,3�� �� �Ǵ� ������� �����ϴ�
}
