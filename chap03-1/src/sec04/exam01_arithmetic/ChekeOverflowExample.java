package sec04.exam01_arithmetic;
//좀 어려움. 오버플로우를 체크하는 매소드. 10장에서 배우는 내용!!! 너무 빨라!!!!!!!!!!1
어려워. 해당  복습 진행. 나중에 safeadd 부분, try catch 부분 나오면 진행
public class ChekeOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch(ArithmeticException e) {//ArithmeticException:정수를 0으로 나눌때 발생하는 예외?
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수가 없음");
		}
		 //System.out.println("여기까지 로직이 있을경우에도 문제없음");
		
	}
	
	public static int safeAdd(int left, int right) {//safeAdd method로 보며 상황 발생시 상위로 던져준다(?!
		if(right>0) {
		//left + right > Integer.MAX_VALUE
			if(left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
			
		} else {
			//left + right < Integer.MIN_VALUE
			if(left<Integer.MIN_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}

		return left + right;
	}

}
