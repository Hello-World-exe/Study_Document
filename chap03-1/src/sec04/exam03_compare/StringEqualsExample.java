package sec04.exam03_compare;
// ��Ʈ�� ���ڰ��� ���� ��
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = strVar1; //�� ���� ���� ���Ǯ���� ���� ģ������ ���� ���� ���ͷ����� ���� ���� = �ּҰ��� ����
		
		String strVar3 = new String("�Ź�ö"); // ������ ��ü�� ���� ����Ŷ� ������ ���Ǯ���� Ƣ��� �Ź�ö���� �ٸ���
		
		System.out.println(strVar1 == strVar2); //true
		System.out.println(strVar1 == strVar3); //false
		
		//���ڿ��� ���ҋ��� �ּҰ� �ƴ϶� �ܼ��� �������� ���ϰ� ������ ������ ����Ѵ�
		
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //true
		System.out.println(strVar1.equals(strVar3)); //true
		//���߿� Ŭ���� �����Ҷ� �� �� ���������� ����
		
	}

}
