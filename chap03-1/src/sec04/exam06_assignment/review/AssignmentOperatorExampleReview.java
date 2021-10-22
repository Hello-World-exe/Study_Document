package sec04.exam06_assignment.review;

public class AssignmentOperatorExampleReview {
	public static void main(String[] args) {
		int result = 0;
		
		result += 10;
		System.out.println(result);//result = result + 10 = 10
		
		result -= 5;
		System.out.println(result);//result = result - 5 = 5
		
		result *= 3;
		System.out.println(result);//result = result * 3 = 15
		
		result /= 5;
		System.out.println(result);//result = result / 5 = 3
		
		result %= 2;
		System.out.println(result);//result = result % 2 = 1
		
		result = 3;
		result %=5;
		System.out.println(result);//무한이 이어지는 소숫점에선 뭐가나올까? 지금 해봤을 땐 첫번째 자리만 나옴
		
		result = 1;
		result %=4;
		System.out.println(result);// 나머지가 없어서 그런지 그대로 나옴
	}

}
// 대입 연선자 복습, %값 복습