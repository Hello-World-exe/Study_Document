package sec04.exam05_bit;

public class BitShifrExample {
	public static void main(String[] args) {
		System.out.println(toBinaryString(1));
		System.out.println("<<3");
		System.out.println(toBinaryString(1<<3));
		
		System.out.println(1<<3);
		System.out.println(-8>>3);
		System.out.println(-8>>>3);
		
		System.out.println(toBinaryString(-8>>>3));
			
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		return str;
	}

}
