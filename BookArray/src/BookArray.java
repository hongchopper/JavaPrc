import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}

public class BookArray{
	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner scn= new Scanner(System.in);
		for(int i=0;i<book.length;i++) {
			System.out.print("제목: ");
			String title = scn.nextLine();//공백 포함 문장 전체
			System.out.print("저자: ");
			String author = scn.nextLine();//공백 포함 문장 전체
			book[i]=new Book(title,author);
		}
		
		for(int i=0;i<book.length;i++) {
			System.out.print("("+book[i].title+","+book[i].author+")");
		}
		
		scn.close();
	}
}