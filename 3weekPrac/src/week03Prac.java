import java.util.Scanner;

public class week03Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���� 1
		System.out.print("�ٹ��ð��� �Է��ϼ���:");
		Scanner scn=new Scanner(System.in);//�Է¿� ��ĳ�� ��ü ����
		
		int workHour = scn.nextInt();
		
		int salary = 10000;
		
		if(workHour>8) {
			System.out.println(workHour*salary*1.5+"�� : �Ϲ��ӱ�x1.5���Դϴ�.");
		} else {
			System.out.println(workHour*salary+"�� : �Ϲ��ӱ��Դϴ�.");
		}
		*/

		/*����2
		System.out.print("�����ݾ��� �Է��ϼ���(���� ����):");
		Scanner scn=new Scanner(System.in);//�Է¿� ��ĳ�� ��ü ����
		
		int tax = scn.nextInt();
		
		if(tax<=1000) {
			int taxableAmount = (int)(tax*0.09);
			System.out.println("�ҵ漼�� "+taxableAmount+"���� �Դϴ�.");
		} else if(tax<=4000) {
			int taxableAmount = (int)(tax*0.18);
			System.out.println("�ҵ漼�� "+taxableAmount+"���� �Դϴ�.");
		} else if(tax<8000) {
			int taxableAmount = (int)(tax*0.27);
			System.out.println("�ҵ漼�� "+taxableAmount+"���� �Դϴ�.");
		} else {
			int taxableAmount = (int)(tax*0.36);
			System.out.println("�ҵ漼�� "+taxableAmount+"���� �Դϴ�.");
		}
		*/
		
		/*���� 3
		System.out.print("������ �Է����ּ��� :");
		Scanner scn=new Scanner(System.in);//�Է¿� ��ĳ�� ��ü ����
		
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
		
		/*���� 4
		System.out.print("������ �Է��ϼ��� : ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1���� "+num+" ������ �հ�� "+sum+"�Դϴ�.");
		*/
		
		/*���� 5
		System.out.print("�������� ���ϴ� ���� �Է��ϼ��� : ");
		Scanner scn = new Scanner(System.in);
		int front = scn.nextInt();
		int behind = 1;
		
		while(behind<=front) {
			System.out.println(front+"X"+behind+"="+front*behind);
			behind++;
		}
		*/
		
		/*���� 6
		for(int front=1; front<=9; front++) {
			for(int behind=1; behind<=9; behind++) {
				System.out.println(front+"X"+behind+"="+front*behind);
			}
			System.out.println();
		}
		*/
		
		/*���� 7
		for(int row=1; row<=5; row++) {
			for(int column=1; column<=5; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*���� 8
		int correctAnswer = 57;
		int i=0;
		int answer=0;
		do {
			System.out.print("���ڸ� �Է��ϼ���(0~100����) : ");
			Scanner scn = new Scanner(System.in);
			answer = scn.nextInt();
			i++;
		} while (answer!=correctAnswer);
		System.out.println("�����Դϴ�! �õ�Ƚ���� �� "+i+"�� �Դϴ�.");
		*/
		
		int score=0;
		int sum=0;
		int i=0;
		
		while (score > 0) {
			System.out.print("������ �Է��ϼ��� : ");
			Scanner scn = new Scanner(System.in);
			score = scn.nextInt();
			sum+=score;
			i++;
		}
		System.out.println("��� ������ "+sum/i+"�Դϴ�.");
		
		//scn.close();	//��ĳ�� �ݱ�
	}

}
