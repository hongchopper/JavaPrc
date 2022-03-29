package joonas;
import java.util.Scanner;

public class Joonas {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		
		if(name.equals("joonas")) {
			System.out.print(name+"??!");
		}
		else {
			System.out.print(name);
		}
		
		scn.close();
	}
}
