package sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 8.0;
		String str2 = str1 + " 특징";
		
		System.out.println(str2); //연결연결사를 써서 문장을 연결시킴
		
		String str3 = "JDK" + 5 + 3.0; // 5가 문자열에 먼저 붙여 연결연산자가 되어 붙자마자 문자타입으로 됨
		String str4 = 5 + 3.0 + "JDK"; // 5랑 3.0이 먼저 붙어서 int로 연산이 되어버렸고 이후에 오는 문장형이 분터 연결 연산자가 되어버림
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
