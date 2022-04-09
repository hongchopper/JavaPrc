import java.util.Scanner;

public class ArrayAccess {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		int intArray[]=new int[5];
		int sum = 0;
		System.out.println(intArray.length+"개의 정수를 입력하세요:");
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = scn.nextInt();
			sum+=intArray[i];
			}
		System.out.print("평균은"+(double)sum/intArray.length+"입니다.");
		scn.close();
	}
	
}
