package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; //���� �� int ������ �����Ǿ� ������ ������ �߻��Ѵ�
		int c3 = c2 + 1; //�׷��Ƿ� �ƿ� int Ÿ������ �ٲپ� ������ �ϸ� ������ �߻����� �ʴ´�
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println(c3);
		System.out.println((char)c3);
	}

}
