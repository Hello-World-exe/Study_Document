package sec03.exam02_increase_decrease;
//연산자 부분 == -- 부분
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
		
		z = x++;  // x= 12++   ++이 뒤에 있으니까 앞에 있는 등호식을 먼저 계산하고 다음에 더하라는것. 그러므로 z는 12가되고 x는 13이 된다
		System.out.println("z = " + z);
		System.out.println("x++ = " + x);
		System.out.println("--------------");
		
		z = ++x; // ++가 앞에 있음. ++13 그러므로 1 더하기를 먼저한 뒤 부등호를 진행한다. 그러므로 z는 14가 되고 x는 14가 된다
		System.out.println("z = " + z);
		System.out.println("++x = " + x);
		System.out.println("--------------");
		
		z = ++x + y++;
		/* Z = 15 + 8 = 23
		 * X = 15
		 * Y = 9
		 * 우선순위를 먼저 캐치하는 능력이 중요하다
		 */
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		
		
		
		
	}

}
