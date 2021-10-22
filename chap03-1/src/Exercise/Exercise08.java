package Exercise;
//실무에선 탭사이즈를 거의 4번 정도 침. 인벤테이션이라고함
public class Exercise08 {
	public static void main(String[] args) {
		double x =5.0;
		double y = 0.0;
		
		double z = x%y;
		
		if(Double.isNaN(z)) { //Double의 래퍼클래스 에서 지원하는 inNaN을 사용
			System.out.println("0.0으로 나눌 수 없숩니다");
		} else {
			double result = z+10;
			System.out.println("결과: " + result);
		}
	}

}
