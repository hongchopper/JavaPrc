import java.util.Scanner;

public class Thailand {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		if(year>=1000 && year<=3000) {
			System.out.print(year-543);
		} else {
			year=scn.nextInt();
		} 
	}
}
