package methods;

import java.util.Scanner;

public class WithReturnTNoArgs4 {
	int add(){
		int salary=1000;
		int tax=100;
		int totals=salary-tax;
		
		return totals;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		WithReturnTNoArgs4 obj2=new WithReturnTNoArgs4();
		
		int total=obj2.add();
		System.out.println("Total Salary = "+total);
		
	}
	
	
	
	/*int mul(){
		Scanner scanner=new Scanner(System.in);
		
		int sizenum;
		
		System.out.println("Enter , Until Which num do u want to multiplied: ");
		int num=scanner.nextInt();
		System.out.println("..............Your Mul Table of "+sizenum+"...............");
		for(int i=1;i<=num;i++){
			int totals=i*sizenum;
			System.out.println(i+" X "+sizenum+" = "+ totals);
			
		}
		
		return totals;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		WithReturnTNoArgs4 obj2=new WithReturnTNoArgs4();
		
		System.out.print("Enter number do u want to multiply : ");
		int sizeofnum=scan.nextInt();
		
		
		int total=obj2.mul();
		

	}*/

}
