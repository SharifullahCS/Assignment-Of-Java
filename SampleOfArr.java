import java.util.Scanner;


public class SampleOfArr {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter values in array :");
//		int num=scan.nextInt();
		
		
		int [] arr= new int [6];
		for(int i=0;i<6;i++){
			System.out.print("Enter Array["+i+"] Pos num : ");
			arr[i]=scan.nextInt();
			
		}
		System.out.println("................ Your entry ................");
		for(int i=0;i<6;i++){
			System.out.println("Num of ["+i+"] Pos = "+arr[i]);

		}
		
		
	}

}
