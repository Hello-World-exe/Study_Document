package sec04.exam05_bit;
//��Ʈ�� ������
public class BitlogicExample {
	public static void main(String[] args) {
		System.out.println(45 & 25); // 45: 0010 1101 
		                             // 25: 0001 1001
		                             // & : 0000 1001 (����&�� Ư��:�� �� 1�̿����� 1) = 1*2^3+1*2^0 = 9
		System.out.println(45|25);   // 45: 0010 1101 
                                     // 25: 0001 1001
		                             // | : 0011 1101 (���� |�� Ư��: �� �� �ϳ��� 1�̸� 1) = 61
		System.out.println(45^25);   // 45: 0010 1101 
                                     // 25: 0001 1001
		                             // ^ : 0011 0100 (���� ^�� Ư��: ���� ���� �޶������ 1)
		System.out.println(~45); //-46 ������ ����
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
		
	}
	
	
	public static String toBinaryString(int value) { //void�� �ϸ� �����ϴ°� ���� String�̶� ����Ͽ��� ������ �� ��ȯ�� ������Ѵ�
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
		
	}

}
