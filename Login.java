package FaceBook;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Facebook obj=new Facebook();
		
		System.out.println(" Email   OR   Phone ???");
		String email;
		int phone;
		 
		if(scan.hasNextInt()){
			System.out.print("Phone : ");
			phone=scan.nextInt();
			obj.login(phone);
			
		}
		else{
			String data=scan.next();
			email=data.substring(0, data.indexOf('@'));
			obj.login(email);
			
		}
	}

}
