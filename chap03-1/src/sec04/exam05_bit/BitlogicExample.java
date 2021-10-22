package sec04.exam05_bit;
//비트논리 연산자
public class BitlogicExample {
	public static void main(String[] args) {
		System.out.println(45 & 25); // 45: 0010 1101 
		                             // 25: 0001 1001
		                             // & : 0000 1001 (논리곱&의 특성:둘 다 1이여야지 1) = 1*2^3+1*2^0 = 9
		System.out.println(45|25);   // 45: 0010 1101 
                                     // 25: 0001 1001
		                             // | : 0011 1101 (논리곱 |의 특성: 둘 둥 하나만 1이면 1) = 61
		System.out.println(45^25);   // 45: 0010 1101 
                                     // 25: 0001 1001
		                             // ^ : 0011 0100 (논리곱 ^의 특성: 둘이 서로 달라야지만 1)
		System.out.println(~45); //-46 보수가 나옴
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
		
	}
	
	
	public static String toBinaryString(int value) { //void로 하면 리턴하는게 없음 String이라 명시하였기 때문에 꼭 반환을 해줘야한다
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
		
	}

}
