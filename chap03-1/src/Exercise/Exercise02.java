package Exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		      //11 + 20 = 31 (x���̶� ��ȣ���� ����)
		      //y
		System.out.println(z);
		System.out.println(y);
		
		//x�� ���� 1�� ������, X�� Y���� ����, Z���� ����, Y�� -1 ��
	}

}
