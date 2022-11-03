package classesCallingwithEachOthers;

import java.util.Scanner;

public class C {
	
	
	void rem(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter integers for Remindering ");
		System.out.print("No 1 : ");
		int n1=scan.nextInt();
		System.out.print("No 2 : ");
		int n2=scan.nextInt();
		
		System.out.println(n1+" % "+n2+" Rem is = "+(n1%n2));
		System.out.println(">>>>>>>>>>>>> The End <<<<<<<<<<<<<<<<<<<");
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		C c=new C();
		A a=new A();
		B b=new B();
		
		System.out.println("Enter tow nums for division : ");
		System.out.print("No 1 : ");
		int num1=scan.nextInt();
		System.out.print("No 2 : ");
		int num2=scan.nextInt();
		
		System.out.println("Finaly !   "+num1+" / "+num2+" = "+(num1/num2));
		
		
	}

}
