public class week04Prac { //Book�̸����
	String title;
	String author;
	
	public week04Prac() {
		title="�������";
		author="���ڹ̻�";
	}
	
	public week04Prac(String t) {
		title=t;
		author="���ڹ̻�";
	}
	
	public week04Prac(String t, String a) {
		title=t;
		author=a;
	}
	
	public static void main(String args[]) {
		week04Prac noTitle = new week04Prac();
		week04Prac littlePrince = new week04Prac("�����","�������丮");
		week04Prac loveStory = new week04Prac("������");
		System.out.println(noTitle.title+" "+noTitle.author);
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}
