package Class;
import java.lang.*;
public class Wrapper {

	public static void main(String[] args) {
//		converting int into integer 
//		int a = 20;
//
//		Integer i = Integer.valueOf(a);
//		Integer j = a;
//		System.out.println(a+ " "+i+" "+j);
		
		// Converting Integer into int 
		Integer a = new Integer(3);
		int  i = a.intValue();// Unboxing : converting Integer into int.
		int j = a;
		System.out.println(a+" "+i+" "+j);
		
	}

}
