package sec04.exam01_arithmetic;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		// 1번과 다르게 소숫점이 안나오게 함. -> double로 진입조차  10-7=3이 될 것이다
		
		double result = temp/10.0; //temp 0.3
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면");
		System.out.println(result + "조각이 남는다.");
		
		//이렇게 소수점이 아예안나오게 해서 값을 구하는 방법
		
		
	}

}
