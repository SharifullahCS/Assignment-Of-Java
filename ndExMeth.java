package CompileTime;
import java.util.*;

public class ndExMeth {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		ndOverloding pers1=new ndOverloding(70000);
		System.out.print(" Rent : ");
		int rent=scan.nextInt();
		System.out.print(" Tax  : ");
		int tax=scan.nextInt();
		pers1.Payment(rent, tax);
		
		System.out.println("\n\n ............... Obj2 Starts ...............");
		ndOverloding pers2=new ndOverloding(50000);
		System.out.println("Net Salary = "+pers2.Payment(1000));
		
		System.out.println("\n\n\n.............Obj3 Starts ................");
		ndOverloding pers3=new ndOverloding(7000);
		System.out.print(" Rent : ");
		int ren=scan.nextInt();
		System.out.print(" Tax  : ");
		int ta=scan.nextInt();
		
		pers3.Payment(ren, ta);
		
	}

}
