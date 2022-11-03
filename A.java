package classesCallingwithEachOthers;

import java.util.Scanner;

public class A {
	
	void add(){			///////// For Sum ////////////////
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter how many nums do u want to sum : ");
		int sizeofnum=scan.nextInt();
		int [] arr=new int [sizeofnum];
		int total=0;
		for(int i=0;i<sizeofnum;i++){
			System.out.print("Enter "+(i+1)+" num : ");
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<sizeofnum;i++){
			total=total+arr[i];
			
		}
		System.out.println("Total sum = "+total);
		
	}
	
	void min(){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter how many nums do u want to sum : ");
		int sizeofnum=scan.nextInt();
		int [] arr=new int [sizeofnum];
		int total=0;
		for(int i=0;i<sizeofnum;i++){
			System.out.print("Enter "+(i+1)+" num : ");
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<sizeofnum;i++){
			total=total+arr[i];
			
		}
		System.out.println("Total Mins = "+total);
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		A a=new A();
		B b=new B();
		C c=new C();
		
		System.out.println("Enter your choice for Calculator \n"
				+ "1. for Addition \n"
				+ "2. for Substruction \n"
				+ "3. for Multiplication \n"
				+ "4. for Division \n"
				+ "5. for Reminder \n");
		System.out.print("Choice : ");
		int choice=scan.nextInt();
		
		if(choice==1){
			a.add();
		}
		else if(choice==2){
			a.min();
		}
		else if(choice==3){
			b.main(args);
		}
		else if(choice==4){
			c.main(args);
		}
		else if(choice==5){
			c.rem();
		}
		else{
			System.out.println("Sorry, You come wrong (Try Again) !!!...");
		}
		
		
		
	}

}
