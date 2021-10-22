package Exercise;

public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area =((lengthTop+ lengthBottom)*height)/2; 이렇게 되면 int로 전환되어 소숫점 아래가 날아감
		double area =((lengthTop+ lengthBottom)*height)/2.0;
		
		System.out.println(area);
		/*area =((lengthTop+ lengthBottom)*(char)height)/2;
		System.out.println(area);*/
		
	}

}
