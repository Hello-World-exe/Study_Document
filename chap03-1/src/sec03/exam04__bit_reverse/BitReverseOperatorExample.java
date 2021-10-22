package sec03.exam04__bit_reverse;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		
		int v1 = 10; // 10 =0000 0000  0000 0000  0000 0000  0000 1010
//		int v2 = ~v1;
//		int v3 = ~v1 +1;
		
		System.out.println(toBinaryString(v1) + "(십진수: "+ v1 + ")");
//		System.out.println(toBinaryString(v2) + "(십진수: "+ v2 + ")");
//		System.out.println(toBinaryString(v3) +"(십진수: "+ v3 + ")");
//		System.out.println();
//		
//		int v4 = -10;
//		int v5 = ~v4;
//		int v6 = v4+1;
//		
//		System.out.println(toBinaryString(v4) + "(십진수: "+ v4 + ")");
//		System.out.println(toBinaryString(v5) + "(십진수: "+ v5 + ")");
//		System.out.println(toBinaryString(v6) + "(십진수: "+ v6 + ")");
	}
	
	
	public static String toBinaryString(int value) { //메소드 integer 레퍼 클레스에 있는 메서드의 도움을 받아 바이너리로 뽑아내는 것
		String str = Integer.toBinaryString(value);
		while(str.length()< 32) {
			str = "0" + str;
		}
		return str;
	}

}
