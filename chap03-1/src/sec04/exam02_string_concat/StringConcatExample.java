package sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 8.0;
		String str2 = str1 + " Ư¡";
		
		System.out.println(str2); //���Ῥ��縦 �Ἥ ������ �����Ŵ
		
		String str3 = "JDK" + 5 + 3.0; // 5�� ���ڿ��� ���� �ٿ� ���Ῥ���ڰ� �Ǿ� ���ڸ��� ����Ÿ������ ��
		String str4 = 5 + 3.0 + "JDK"; // 5�� 3.0�� ���� �پ int�� ������ �Ǿ���Ȱ� ���Ŀ� ���� �������� ���� ���� �����ڰ� �Ǿ����
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
