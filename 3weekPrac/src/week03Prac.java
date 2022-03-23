import java.util.Scanner;

public class week03Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*예제 1
		System.out.print("근무시간을 입력하세요:");
		Scanner scn=new Scanner(System.in);//입력용 스캐너 객체 생성
		
		int workHour = scn.nextInt();
		
		int salary = 10000;
		
		if(workHour>8) {
			System.out.println(workHour*salary*1.5+"원 : 일반임금x1.5배입니다.");
		} else {
			System.out.println(workHour*salary+"원 : 일반임금입니다.");
		}
		*/

		/*예제2
		System.out.print("과세금액을 입력하세요(만원 단위):");
		Scanner scn=new Scanner(System.in);//입력용 스캐너 객체 생성
		
		int tax = scn.nextInt();
		
		if(tax<=1000) {
			int taxableAmount = (int)(tax*0.09);
			System.out.println("소득세는 "+taxableAmount+"만원 입니다.");
		} else if(tax<=4000) {
			int taxableAmount = (int)(tax*0.18);
			System.out.println("소득세는 "+taxableAmount+"만원 입니다.");
		} else if(tax<8000) {
			int taxableAmount = (int)(tax*0.27);
			System.out.println("소득세는 "+taxableAmount+"만원 입니다.");
		} else {
			int taxableAmount = (int)(tax*0.36);
			System.out.println("소득세는 "+taxableAmount+"만원 입니다.");
		}
		*/
		
		/*예제 3
		System.out.print("점수를 입력해주세요 :");
		Scanner scn=new Scanner(System.in);//입력용 스캐너 객체 생성
		
		int score = scn.nextInt();
		
		if(score>=95) {
			System.out.println("A+");
		} else if(score>=90) {
			System.out.println("A");
		} else if(score>=85) {
			System.out.println("B+");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=75) {
			System.out.println("C+");
		} else if(score>=70) {
			System.out.println("C");
		} else {
			System.out.println("D or F");
		}
		*/
		
		/*예제 4
		System.out.print("정수를 입력하세요 : ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1부터 "+num+" 까지의 합계는 "+sum+"입니다.");
		*/
		
		/*예제 5
		System.out.print("구구단을 원하는 단을 입력하세요 : ");
		Scanner scn = new Scanner(System.in);
		int front = scn.nextInt();
		int behind = 1;
		
		while(behind<=front) {
			System.out.println(front+"X"+behind+"="+front*behind);
			behind++;
		}
		*/
		
		/*예제 6
		for(int front=1; front<=9; front++) {
			for(int behind=1; behind<=9; behind++) {
				System.out.println(front+"X"+behind+"="+front*behind);
			}
			System.out.println();
		}
		*/
		
		/*예제 7
		for(int row=1; row<=5; row++) {
			for(int column=1; column<=5; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*예제 8
		int correctAnswer = 57;
		int i=0;
		int answer=0;
		do {
			System.out.print("숫자를 입력하세요(0~100사이) : ");
			Scanner scn = new Scanner(System.in);
			answer = scn.nextInt();
			i++;
		} while (answer!=correctAnswer);
		System.out.println("정답입니다! 시도횟수는 총 "+i+"번 입니다.");
		*/
		
		int score=0;
		int sum=0;
		int i=0;
		
		while (score > 0) {
			System.out.print("점수를 입력하세요 : ");
			Scanner scn = new Scanner(System.in);
			score = scn.nextInt();
			sum+=score;
			i++;
		}
		System.out.println("평균 점수는 "+sum/i+"입니다.");
		
		//scn.close();	//스캐너 닫기
	}

}
