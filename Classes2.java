package VariablesCalling;

import java.util.Scanner;

public class Classes2 {
	
	int bones=9000;			/////// 1. Instance Variable........
	static int salary=40000;	/// 2. Static Variable .........
	
	
	
	void show(){ 	////////  Function  //////////
					/// 3. Local Variable (Never will be CALL) ..........
		int tax=1000;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Classes2 obj=new Classes2();
		
		int bon=obj.bones;			//// 1. Calling Instance Var  /////////
		System.out.println("Bones = "+bon);
		
		int sal=salary;				//// 2. Calling of Static Var /////////
		System.out.println(bon+" + "+sal+" = "+(bon+sal));
		
		

	}

}
