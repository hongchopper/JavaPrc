public class week04Prac { //Book�̸����
	String title;
	String author;
	
	public week04Prac() {
		title="�������";
		author="���ڹ̻�";
	}
	
	public week04Prac(String t) {
		t=title;
		author="���ڹ̻�";
	}
	
	public week04Prac(String t, String a) {
		t=title;
		a=author;
	}
	
	public static void main() {
		week04Prac noTitle = new week04Prac();
		week04Prac littlePrince = new week04Prac("�����","�������丮");
		week04Prac loveStory = new week04Prac("������");
		System.out.println(noTitle+""+noTitle.author);
		System.out.println(littlePrince+""+littlePrince.author);
		System.out.println(loveStory+""+loveStory.author);
	}
}
