package sec04.exam03_compare;
// 스트링 문자값에 대한 비교
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = strVar1; //이 둘은 같은 상수풀에서 나온 친구여서 같게 나옴 리터럴에서 같이 나옴 = 주소값이 같다
		
		String strVar3 = new String("신민철"); // 별도의 개체가 새로 만든거라 기존에 상수풀에서 튀어나온 신민철과는 다르다
		
		System.out.println(strVar1 == strVar2); //true
		System.out.println(strVar1 == strVar3); //false
		
		//문자열을 비교할떄는 주소가 아니라 단순히 논리값만을 비교하고 싶으면 이퀄을 써야한다
		
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //true
		System.out.println(strVar1.equals(strVar3)); //true
		//나중에 클레스 공부할때 좀 더 집중적으로 들어갈꺼
		
	}

}
