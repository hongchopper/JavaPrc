public class week04Prac { //Book이름대신
	String title;
	String author;
	
	public week04Prac() {
		title="제목없음";
		author="작자미상";
	}
	
	public week04Prac(String t) {
		title=t;
		author="작자미상";
	}
	
	public week04Prac(String t, String a) {
		title=t;
		author=a;
	}
	
	public static void main(String args[]) {
		week04Prac noTitle = new week04Prac();
		week04Prac littlePrince = new week04Prac("어린왕자","생텍쥐페리");
		week04Prac loveStory = new week04Prac("춘향전");
		System.out.println(noTitle.title+" "+noTitle.author);
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}
