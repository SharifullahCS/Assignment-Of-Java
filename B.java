package classesCallingwithEachOthers;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		B b=new B();
		A a=new A();
		C c=new C();
		
		
		int total=1;
		System.out.print("Howmany nums do you want to multiplied :  ");
		int mulsize=scan.nextInt();
		int [] arr=new int [mulsize];
		
		for(int i=0;i<mulsize;i++){
			System.out.print("Enter "+(i+1)+" Num : ");
			arr[i]=scan.nextInt();
			total=total*arr[i];
			
		}
			
		System.out.println("Finaly Total = "+total);
		System.out.println(".................The End....................");
		
		
		
		
	}

}
