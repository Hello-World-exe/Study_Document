package sec04.exam07_conditional.review;

public class ConditionalOperationExampleReviwe {
	public static void main(String[] args){
		int point = 98;
		char result1 = (point>80) ? 'A' : 'B';
		System.out.println(result1);
		
		char result2 = (point>70) ? ((point > 90) ? 'O' : 'S') : 'A'; //여러게 섞어서 진행. true 값에 연산식을 넣어서 진행해봄
		
		System.out.println(result2);
		
	}
//결론: 3개의 피연산자를 쓰는 식. 순서대로 1,2,3 피연산자라고 하며 1번의 참이나 것이시냐에 따라 2,3번 피연산자로 넘어가 며 이 때 2,3은 값 또는 연산식이 가능하다
}
