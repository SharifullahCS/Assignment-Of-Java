package methods;

import java.util.Scanner;

public class NoRetNoArgs {
	///////////////////////For Sum.........................................
	void sum(){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter size of nums for sum : ");
		int sizenum=scan.nextInt();
		int [] arr=new int [sizenum];
		int sum=0;
		
		System.out.println("Enter Nums : ");
		for(int i=0;i<sizenum;i++){
			System.out.print("Num '"+i+"' = ");
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<sizenum;i++){
			System.out.print(arr[i]+" + ");
			sum=sum+arr[i];
		}System.out.println("Total sum = "+sum);
	};
	////////////////////for Mul.................................................
	void mul(){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter size of nums for Multiplication : ");
		int sizenum=scan.nextInt();
		int [] arr=new int [sizenum];
		int mul=0;
		
		System.out.println("Enter Nums : ");
		for(int i=0;i<sizenum;i++){
			System.out.print("Num '"+i+"' = ");
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<sizenum;i++){
			System.out.print(arr[i]+" * ");
			mul=mul*arr[i];
		}System.out.println("Total  = "+mul);
	};
	//////////////////////////for Division.....................................
	void div(){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter size of nums for Division : ");
		int sizenum=scan.nextInt();
		int [] arr=new int [sizenum];
		int dev=0;
		
		System.out.println("Enter Nums : ");
		for(int i=0;i<sizenum;i++){
			System.out.print("Num '"+i+"' = ");
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<sizenum;i++){
			System.out.print(arr[i]+" / ");
			dev=dev/arr[i];
		}System.out.println("Total sum = "+dev);
	};
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//////////////////Make Object required.......................
		NoRetNoArgs clas=new NoRetNoArgs();
		
		System.out.println("1. for Total Sum/Min ! ");
		System.out.println("2.for Total Of Multiplication ! ");
		System.out.println("3.for Total of Division ! ");
		System.out.println("Enter Your Choice : ");
		int choice=scanner.nextInt();
		if(choice==1)
			clas.sum();
		
		else if(choice==2)
			clas.mul();
			
		else if(choice==3)
			clas.div();
			
		else{
			System.out.println("");
		}
			

	}

}
