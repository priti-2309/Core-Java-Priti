package Lab;

import java.util.*;

class Book{
	int bookId;
	String bookName;
	String authorName;
	
	Book(int bookId,String bookName,String authorName){
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
	}
}

public class BookData {

	public static void main(String[] args) {
		List<Book>bookinf=new ArrayList<>();
		Book b1=new Book(101,"The Alchemist","Paulo Coelho");
		Book b2=new Book(102,"Pride and Prejudice","Jane Austen");
		Book b3=new Book(101,"Invisble Man","Ralph Ellison");
		Book b4=new Book(101,"War and Peace","Leo Tolstoy");
		bookinf.add(b1);
		bookinf.add(b2);
		bookinf.add(b3);
		bookinf.add(b4);
		
		for(Book b:bookinf)
			System.out.println(b.bookId+" "+b.bookName+" "+b.authorName);
		

	}

}
