import java.util.Scanner;

public class ArrayAccess {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		int intArray[]=new int[5];
		int sum = 0;
		System.out.println(intArray.length+"���� ������ �Է��ϼ���:");
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = scn.nextInt();
			sum+=intArray[i];
			}
		System.out.print("�����"+(double)sum/intArray.length+"�Դϴ�.");
		scn.close();
	}
	
}
