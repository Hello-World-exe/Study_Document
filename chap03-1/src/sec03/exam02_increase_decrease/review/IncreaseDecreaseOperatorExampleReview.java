package sec03.exam02_increase_decrease.review;
//증감연산자
public class IncreaseDecreaseOperatorExampleReview {
	public static void main(String[] args) {
		int x =10;
		int y =9;
		int z;
		
		x++; //x=11
		y=x++; //x=12 y=11 ++
		System.out.println(x);
		System.out.println(y);
		System.out.println();

		y=++x; //x=13 y=13
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		z = --x + y++; //x=12 z=12 y 14
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//어떤 연산자가 있는지, 연산자의 순서는  어떻게 되는지, 연산자의 역할이 무엇인지 확인하는 능력이 필요하다
		System.out.println();
		//y = -y;
		z = --x + -y;// x=11
		
		
		System.out.println(x);
		//System.out.println(y);
		System.out.println(z);
		
				
		//식을 만들때 가독성이 좋게 만들어 주는 것도 중요!!
	}
	
	

}
