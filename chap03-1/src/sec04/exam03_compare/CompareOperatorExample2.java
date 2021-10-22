package sec04.exam03_compare;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3);//true
		
		System.out.println();
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println(v4==v5);	// 소숫점 이하로 인해 오차발생
		System.out.println((float)v4 == v5);//플로트오 올려버려서 비교
		System.out.println((int)(v4*10) == (int)(v5*10));//정수 타입으로 만들어서 비교
	}

}
