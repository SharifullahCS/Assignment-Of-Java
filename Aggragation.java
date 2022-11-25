import java.util.*;

class Author{
	String authorName;
	int authorAge;
	public Author(String authorName, int authorAge){
		this.authorName=authorName;
		this.authorAge=authorAge;
	}
}

public class Aggragation {
	int bookId;
	String bookName;
	static Author auther;	//Here we hava Aggregation.....
	public Aggragation(int bookId,String bookName,Author author){
		this.bookId=bookId;
		this.bookName=bookName;
		this.auther=auther;
	}
	public void showDetials(){
		System.out.println("BookId : "+bookId);
		System.out.println("BookName:"+bookName);
		System.out.println("BookAuther:"+auther.authorName+"AuthorAge:"+auther.authorAge+" ");
		
	}
	public static void main(String[] args) {
		Author author=new Author("Bala",45);
		Aggragation book=new Aggragation(1,"RF",author);
		
		book.showDetials();
		
	}

}
