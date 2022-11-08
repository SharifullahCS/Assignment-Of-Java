package methods;

import java.util.Scanner;

public class MoreExsPassReturn {
	
	double test1;
	double test2;
	double test3;
	double optimalmarks;
	double average;
	
	char markscalculator(double t1,double t2,double t3){
		test1=t1;
		test2=t2;
		test3=t3;
		optimalmarks=test1+test2+test3;
		double totalmarks=300;
		
		average=optimalmarks/totalmarks*100;
		
		char grade;
		if(average>=90){
			System.out.println("Grade = ");
			grade= 'A';
		}
		else if(average>=80){
			grade= 'B';
		}
		else if(average>=70){
			grade= 'C';
		}else{
			grade='-';
		}
		
		
		return grade;
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		MoreExsPassReturn obj=new MoreExsPassReturn();
		
		
		System.out.println("Enter 3 marks for test : ");
		
		System.out.print("Enter No 1 : ");
		int t1=scan.nextInt();
		System.out.print("Enter No 2 : ");
		int t2=scan.nextInt();
		System.out.print("Enter No 3 : ");
		int t3=scan.nextInt();
		
		
		
		System.out.println("Average = "+obj.average);
		System.out.println(" Grade "+obj.markscalculator(t1, t2, t3));
		
	}

}
