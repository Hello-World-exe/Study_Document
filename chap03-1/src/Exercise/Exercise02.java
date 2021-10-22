package Exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		      //11 + 20 = 31 (x식이랑 등호먼저 끝냄)
		      //y
		System.out.println(z);
		System.out.println(y);
		
		//x에 먼저 1을 더해줌, X와 Y값을 더함, Z값을 도출, Y에 -1 함
	}

}
