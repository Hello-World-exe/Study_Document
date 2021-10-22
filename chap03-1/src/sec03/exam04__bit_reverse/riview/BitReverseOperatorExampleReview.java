package sec03.exam04__bit_reverse.riview;

public class BitReverseOperatorExampleReview {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 +1;
		
		System.out.println(toBinaryString(v1));
		//toBinaryString 해당 메소드를 사용하기 위해  아래에 toBinaryString 변수를 잡아줘서 진행함
	}

		
	public static String toBinaryString(int value) {
			String str = Integer.toBinaryString(value);
			while(str.length()<32) {
				str = "0"+str;
			}
			return str;
	}
		
	

}
