package sec04.exam01_arithmetic;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		// 1���� �ٸ��� �Ҽ����� �ȳ����� ��. -> double�� ��������  10-7=3�� �� ���̴�
		
		double result = temp/10.0; //temp 0.3
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");
		
		//�̷��� �Ҽ����� �ƿ��ȳ����� �ؼ� ���� ���ϴ� ���
		
		
	}

}
