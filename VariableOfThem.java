package InhrFinalThisSupr;





class A{
	int num1=1;
	int num2=20;
	
}












class B extends A{
	int num3=300;
	int num4=4000;
	
	void show2(){
		int num5=50000;
		int num6=600000;
		System.out.println("Num1 = "+super.num1);
		System.out.println("Num2 = "+super.num2);
		System.out.println("Num3 = "+this.num3);
		System.out.println("Num4 = "+this.num4);
		
		System.out.println("Num5 = "+num5);
		System.out.println("Num6 = "+num6);
	}
}















final class C{///////No one will access Data of this class Without main class..................
	int num7=7000000;
	int num8=80000000;
	void showC(){
		System.out.println("\n\nNum7 = "+this.num7);
		System.out.println("Num8 = "+this.num8);
	}
}









public class VariableOfThem {
	public static void main(String[] args) {
		B obj1=new B();
		obj1.show2();
		
		C obj2=new C();	 
		obj2.showC();
	}
}
