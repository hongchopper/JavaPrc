import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("나누어지는 수를 입력하시오:");
		int dividend = scn.nextInt();
		System.out.print("나누는 수를 입력하시오:");
		int divisor = scn.nextInt();
		
		try {
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
			
			System.out.print("나누는 수를 입력하시오:");
			divisor = scn.nextInt();
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		}
	}
}