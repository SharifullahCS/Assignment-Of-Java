
import java.util.Scanner;

public class Arraysafg {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.print("Enter size of array : ");
		int num =scan.nextInt();
		int [] arr=new int [num];
		
		for(int i=0;i<num;i++){
			System.out.print("Enter num in ["+i+"] index : ");
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("..............U entered...............\n\n");
		
		for(int i=0;i<num;i++){
			System.out.println("Index ["+i+"] = "+arr[i]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
