package sec04.exam01_arithmetic;

public class OverflowExample {
	public static void main(String[] args) {
	/*	int x = 1000000;
		int y = 1000000;
		int z = x * y;
		//System.out.println(z); 이상한 변수가 나옴! 오버플로우 해버려서!!
*/		
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		
		System.out.println(z);
		
	}

}
