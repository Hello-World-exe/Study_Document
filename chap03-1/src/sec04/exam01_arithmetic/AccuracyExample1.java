package sec04.exam01_arithmetic;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면");
		System.out.println(result + "조각이 남는다.");
		// 1-0.7로하면 0.3이 나와야 하는데 0.299999...로 이상하게 나온다. 왜? 
		//double로 인해 정밀도에 차이가 남 이를 해결하는 법 -> 2번 예제로 진입
	}
}
