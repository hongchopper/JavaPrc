import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���������� ���� �Է��Ͻÿ�:");
		int dividend = scn.nextInt();
		System.out.print("������ ���� �Է��Ͻÿ�:");
		int divisor = scn.nextInt();
		
		try {
			System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�.");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
			
			System.out.print("������ ���� �Է��Ͻÿ�:");
			divisor = scn.nextInt();
			System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�.");
		}
	}
}