package VariablesCalling;

import java.util.Scanner;

class B{
	int s=300;
	///////////// Method (Function) In A Class //////////////////
	void show(){
		System.out.println("Class B = "+s);
		
	}
}


public class ClassesCalling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ClassesCalling obj=new ClassesCalling();
		
		
		/////////////////  One Way  //////////////////////
//		B obj2=new B();
//		C obj3=new C();
//		D obj4=new D();
//		System.out.println("Class B = "+obj2.s);
//		System.out.println("Class C = "+obj2.s);
//		System.out.println("Class D = "+obj2.s);

		/////////////////  Second Way  ///////////////////
//		obj2.show();
//		obj3.show();
//		obj4.show();
		
		
		/////////////////  Third Way  ////////////////////
		new B().show();
		new C().show();
		new D().show();
		
		
	}
	
}



class C{
	Classes2 class2=new Classes2();
	int s=400;
	void show(){
		System.out.println("Class C = "+s);
		
	}
}


class D{
	int s=500;
	void show(){
		System.out.println("Class D = "+s);
		
	}
}
