package sec04.exam06_assignment.review;

public class AssignmentOperatorExampleReview {
	public static void main(String[] args) {
		int result = 0;
		
		result += 10;
		System.out.println(result);//result = result + 10 = 10
		
		result -= 5;
		System.out.println(result);//result = result - 5 = 5
		
		result *= 3;
		System.out.println(result);//result = result * 3 = 15
		
		result /= 5;
		System.out.println(result);//result = result / 5 = 3
		
		result %= 2;
		System.out.println(result);//result = result % 2 = 1
		
		result = 3;
		result %=5;
		System.out.println(result);//������ �̾����� �Ҽ������� �������ñ�? ���� �غ��� �� ù��° �ڸ��� ����
		
		result = 1;
		result %=4;
		System.out.println(result);// �������� ��� �׷��� �״�� ����
	}

}
// ���� ������ ����, %�� ����