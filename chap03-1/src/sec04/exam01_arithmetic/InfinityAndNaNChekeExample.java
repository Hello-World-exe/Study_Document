package sec04.exam01_arithmetic;
Ŭ���� ����.���� Ŭ������ ���� ������ ����ִµ� �ű� �κ��� �� ���ذ�...��
public class InfinityAndNaNChekeExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
//		double z = x / y; //�̋� ArithmeticException �������߻��Ͼ����� �ʳ�..
//		double z = x % y;
		
//		System.out.println(Double.isInfinite(z));
//		System.out.println(Double.isNaN(z));//NaN= Not a Number ���ڰ� �ƴϴ�
		
		//�߸��� �ڵ�
//		System.out.println(z+20000);
		//�˸��� �ڵ�
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z+20000);
		}
		/*
		int x =5;
		int y =0;
		try {
			int z = x / y;
			System.out.println("z: "+z);
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}
		
		System.out.println("��� ����");*/
	}

}
