package sec03.exam02_increase_decrease.review;
//����������
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
		//� �����ڰ� �ִ���, �������� ������  ��� �Ǵ���, �������� ������ �������� Ȯ���ϴ� �ɷ��� �ʿ��ϴ�
		System.out.println();
		//y = -y;
		z = --x + -y;// x=11
		
		
		System.out.println(x);
		//System.out.println(y);
		System.out.println(z);
		
				
		//���� ���鶧 �������� ���� ����� �ִ� �͵� �߿�!!
	}
	
	

}
