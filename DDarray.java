
import java.util.Scanner;

public class DDarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Row : ");
		int raw=scan.nextInt();
		System.out.print("Enter Colemn:");
		int col=scan.nextInt();
		
		int [][] arr=new int [raw][col];
		
		for(int i=0;i<raw;i++){
			for(int x=0;x<col;x++){
				System.out.print("Enter num in ["+i+"]["+x+"] Index : ");
				arr[i][x]=scan.nextInt();
				
				
			}
		}
		System.out.println(".............All Entery...............\n");
		
		for(int i=0;i<raw;i++){
			for(int x=0;x<col;x++){
				
				System.out.println("U Entered ["+i+"]["+x+"] Ind : "+arr[i][x]+"   ");
				
			}
		}
		
		
		
		
		

	}

}
