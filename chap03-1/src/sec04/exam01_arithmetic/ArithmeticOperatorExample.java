package sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result=" + result2);

		int result3 = v1 * v2;
		System.out.println("result=" + result3);

		int result4 = v1 / v2;
		System.out.println("result=" + result4);

		int result5 = v1 % v2;
		/*���� ������ ���� ã�Ƴ��� ��. �̸� ���Ͽ� �ش� ���� Ȧ¦����, ��������
		 * �� �� �ְ� ���ִ� ���̴�
		 */
		System.out.println("result=" + result5);

		double result6 = (double)v1 / v2;  //�ɽ����� �� �� �ϳ��� �ϸ� ū �ڷ� Ÿ���� �����η� �˾Ƽ� �Ѿ��. v2�� �ɽ����� ���൵ ������� 2�� �� �ٿ��� �������
		System.out.println("result=" + result6);

	}

}
