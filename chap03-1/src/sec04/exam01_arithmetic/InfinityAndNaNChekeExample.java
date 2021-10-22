package sec04.exam01_arithmetic;
클래스 설정.래퍼 클래스에 관한 내용이 들어있는데 거기 부분이 잘 이해가...ㅠ
public class InfinityAndNaNChekeExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
//		double z = x / y; //이떄 ArithmeticException 에러가발생하야하지 않나..
//		double z = x % y;
		
//		System.out.println(Double.isInfinite(z));
//		System.out.println(Double.isNaN(z));//NaN= Not a Number 숫자가 아니다
		
		//잘못된 코드
//		System.out.println(z+20000);
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z+20000);
		}
		/*
		int x =5;
		int y =0;
		try {
			int z = x / y;
			System.out.println("z: "+z);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
		
		System.out.println("계속 진행");*/
	}

}
