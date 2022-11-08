package StaticBlocks;
import java.util.*;
public class Basics {
	
	void show(){	// Methods!!!
		System.out.println("\nCalling to methods(Funtion's) !!!"
				+ "..................................\n\n");
	}
	
	Basics(){		// Constructor!!!
		System.out.println("Declaration of Constructor"
				+ "...................................\n\n");
	}
	
	{		// Instance Blocks !!!
		System.out.println("Calling to Instance Blocks !!!"
				+ "...................................\n\n");
	}
	
	static {	 //Declaration of Static Blocks !!!
		System.out.println("Declaration of Static Blocks !!!"
				+ "....................................\n\n");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Basics obj=new Basics();
		obj.show();
		
	} 

}
