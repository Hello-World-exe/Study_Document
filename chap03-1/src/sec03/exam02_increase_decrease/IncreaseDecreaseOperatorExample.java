package sec03.exam02_increase_decrease;
//������ �κ� == -- �κ�
public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; //x=x+1 -> 11
		++x; //x=x+1 -> 12
		System.out.println("x = "+x);
		
		y--; //y=y-1; 9
		--y; //y=y-1; 8
		System.out.println("y = "+y);
		System.out.println("--------------");
		
		z = x++;  // x= 12++   ++�� �ڿ� �����ϱ� �տ� �ִ� ��ȣ���� ���� ����ϰ� ������ ���϶�°�. �׷��Ƿ� z�� 12���ǰ� x�� 13�� �ȴ�
		System.out.println("z = " + z);
		System.out.println("x++ = " + x);
		System.out.println("--------------");
		
		z = ++x; // ++�� �տ� ����. ++13 �׷��Ƿ� 1 ���ϱ⸦ ������ �� �ε�ȣ�� �����Ѵ�. �׷��Ƿ� z�� 14�� �ǰ� x�� 14�� �ȴ�
		System.out.println("z = " + z);
		System.out.println("++x = " + x);
		System.out.println("--------------");
		
		z = ++x + y++;
		/* Z = 15 + 8 = 23
		 * X = 15
		 * Y = 9
		 * �켱������ ���� ĳġ�ϴ� �ɷ��� �߿��ϴ�
		 */
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		
		
		
		
	}

}
