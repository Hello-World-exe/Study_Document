package sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result=" + result2);

		int result3 = v1 * v2;
		System.out.println("result=" + result3);

		int result4 = v1 / v2;
		System.out.println("result=" + result4);

		int result5 = v1 % v2;
		/*식의 나머지 값을 찾아내는 식. 이를 통하여 해당 수가 홀짝인지, 몇배수인지
		 * 알 수 있게 해주는 식이다
		 */
		System.out.println("result=" + result5);

		double result6 = (double)v1 / v2;  //케스팅은 둘 중 하나만 하면 큰 자료 타입의 범위로로 알아서 넘어간다. v2에 케스팅을 해줘도 상관없고 2개 다 붙여도 상관없음
		System.out.println("result=" + result6);

	}

}
