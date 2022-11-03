package tests;
import java.util.*;
public class Payments {
	boolean paid=false;
	
	void printDetails(boolean p,Details obj){
		paid=p;
		System.out.println("Stu Name : "+obj.sname);
		System.out.println("Stu fees : "+obj.fees);
		System.out.println("payment of="+obj.month);
		
		if(paid==true){
			System.out.println("Fees Paid ");
		}
		else{
			System.out.println("Fess Not Paid ! ");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
	}

}
