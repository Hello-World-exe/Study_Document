package sec04.exam01_arithmetic;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");
		// 1-0.7���ϸ� 0.3�� ���;� �ϴµ� 0.299999...�� �̻��ϰ� ���´�. ��? 
		//double�� ���� ���е��� ���̰� �� �̸� �ذ��ϴ� �� -> 2�� ������ ����
	}
}
