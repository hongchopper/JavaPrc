import java.util.Scanner;

public class week03Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("근무시간을 입력하세요:");
		Scanner scn=new Scanner(System.in);//입력용 스캐너 객체 생성
		int workHour = scn.nextInt();
		
		int salary = 10000;
		
		if(workHour>8) {
			System.out.println(workHour*salary*1.5+"원 : 일반임금x1.5배입니다.");
		} else {
			System.out.println(workHour*salary+"원 : 일반임금입니다.");
		}

		scn.close();	//스캐너 닫기
	}

}
