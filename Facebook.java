package FaceBook;

public class Facebook {
	public int phone;
	public String email;
	
	public void login(String email){
		this.email=email;
		System.out.println("Welcome ("+email+") Acount! ");
	}
	
	public void login(int phone){
		this.phone=phone;
		System.out.println("Welcome "+phone+" : phoneNo!");
	}
	
}
