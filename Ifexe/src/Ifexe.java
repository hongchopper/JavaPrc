import java.util.Scanner;

public class Ifexe {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if (A<B) {
			System.out.println("<");
		} else {
			//같은 경우
			System.out.println("==");
		}
	}
}
