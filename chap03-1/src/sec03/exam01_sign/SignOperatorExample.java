package sec03.exam01_sign;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		System.out.println(result1);
		
		int result2= -x;
		System.out.println(result2);
		
		short s = 100;     //short 2����Ʈ
		//short result3 = -s;  //���� �� int Ÿ������ ����Ǿ� ������ ������ �߻��Ѵ�. ��ȣ �����ڶ� �ϴ��� ��ȯ�� ��Ǥ���
		int result3 = -s;  //int 4����Ʈ
		System.out.println("result3 = "+ result3);
	}

}
