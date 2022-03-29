public class week04Prac { //Book이름대신
	String title;
	String author;
	
	public week04Prac() {
		title="제목없음";
		author="작자미상";
	}
	
	public week04Prac(String t) {
		t=title;
		author="작자미상";
	}
	
	public week04Prac(String t, String a) {
		t=title;
		a=author;
	}
	
	public static void main() {
		week04Prac noTitle = new week04Prac();
		week04Prac littlePrince = new week04Prac("어린왕자","생텍쥐페리");
		week04Prac loveStory = new week04Prac("춘향전");
		System.out.println(noTitle+""+noTitle.author);
		System.out.println(littlePrince+""+littlePrince.author);
		System.out.println(loveStory+""+loveStory.author);
	}
}
