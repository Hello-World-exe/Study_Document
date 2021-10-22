package sec03.exam01_sign;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		System.out.println(result1);
		
		int result2= -x;
		System.out.println(result2);
		
		short s = 100;     //short 2바이트
		//short result3 = -s;  //연산 시 int 타입으로 변경되어 컴파일 오류가 발생한다. 부호 연산자라 하더라도 젼환이 디ㅗㄴ다
		int result3 = -s;  //int 4바이트
		System.out.println("result3 = "+ result3);
	}

}
