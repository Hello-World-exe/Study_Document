package sec04.exam01_arithmetic;
//�� �����. �����÷ο츦 üũ�ϴ� �żҵ�. 10�忡�� ���� ����!!! �ʹ� ����!!!!!!!!!!1
�����. �ش�  ���� ����. ���߿� safeadd �κ�, try catch �κ� ������ ����
public class ChekeOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch(ArithmeticException e) {//ArithmeticException:������ 0���� ������ �߻��ϴ� ����?
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� ���� ����");
		}
		 //System.out.println("������� ������ ������쿡�� ��������");
		
	}
	
	public static int safeAdd(int left, int right) {//safeAdd method�� ���� ��Ȳ �߻��� ������ �����ش�(?!
		if(right>0) {
		//left + right > Integer.MAX_VALUE
			if(left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
			
		} else {
			//left + right < Integer.MIN_VALUE
			if(left<Integer.MIN_VALUE - right) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}

		return left + right;
	}

}
