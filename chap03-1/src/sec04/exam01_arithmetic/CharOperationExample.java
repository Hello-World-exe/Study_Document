package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; //연산 시 int 형으로 변형되어 컴파일 오류가 발생한다
		int c3 = c2 + 1; //그러므로 아예 int 타입으로 바꾸어 연산을 하면 에러가 발생하지 않는다
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println(c3);
		System.out.println((char)c3);
	}

}
