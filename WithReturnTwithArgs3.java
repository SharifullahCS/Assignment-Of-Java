package methods;

import java.util.Scanner;

public class WithReturnTwithArgs3 {
	
	boolean bookint(int age){
		boolean allow;
		if(age>=18){
			allow=true;
		}
		else{
			allow=false;
		}
		
		return allow;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		WithReturnTwithArgs3 obj3=new WithReturnTwithArgs3();
		
		System.out.print("Enter your Age = ");
		int age=scan.nextInt();
		
		
		/////////.....First Way..................
		boolean a=obj3.bookint(age);
		if(a==true){
			System.out.println("You r Eligible for Booking...........");
		}
		else{
			System.out.println("You arn't Eligible for Booking.......");
		}
		
		
		
		/////////....Second Way.....................
//		if(obj3.bookint(age)){
//			System.out.println("You r Eligible for Booking...........");
//			
//		}
//		else{
//			System.out.println("You arn't Eligible for Booking.......");
//		}
		
		
		
	
		/*
	int mul(int x,int y){
		int total=x*y;
		
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		WithReturnTwithArgs3 obj=new WithReturnTwithArgs3();
		
		System.out.print("Enter 1th: ");
		int st=scan.nextInt();
		
		System.out.print("Enter 2nd: ");
		int nd=scan.nextInt();
		
		int total=obj.mul(st, nd);
		System.out.println("\n\n"+st+" X "+nd+" = "+total);
		*/
		
		
	}

}
