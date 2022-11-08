package BasicsPro;

class A{
	
	void method1(){
		System.out.println("In Method 1 ");
	}
	void method2(){
		System.out.println("In Method 2 ");
	}
}


class B extends A{		//extends A   Mean the first 2 methods are not nessecory !!!
//	void method1(){
//		System.out.println("In Method 1 ");
//	}
//	void method2(){
//		System.out.println("In Method 2 ");
//	}
	
	void method3(){
		System.out.println("In Method 3 ");
	}
	void method4(){
		System.out.println("In Method 4 ");
	}
	
}







public class BasicsPro {
	
	public static void main(String[] args) {
		//// 2nd Way of Calling these Classes (And Methods) !!!
		C obj3=new C();
		
		obj3.method1();	// Show Which one do you to Access (Are All Exest) !!!
		
		
		
		
		
		
		//// One of Older Way for Calling .....................
//		A classA=new A();
//		classA.method1();
//		new A().method2();
//		System.out.println(".............. Class A .................\n\n");
//		
//		B classB=new B();
//		classB.method1();
//		new B().method2();
//		new B().method3();
//		new B().method4();
//		System.out.println(".............. Class B .................\n\n");
//		
//		C classC=new C();
//		classC.method1();
//		new C().method2();
//		new C().method3();
//		new C().method4();
//		new C().method5();
//		new C().method6();
//		System.out.println(".............. Class C .................\n");
		
	}

}


class C extends B{		//extends B   Mean the first 4 methods are not nessecory !!!
	
//	void method1(){
//		System.out.println("In Method 1 ");
//	}
//	void method2(){
//		System.out.println("In Method 2 ");
//	}
//	void method3(){
//		System.out.println("In Method 3 ");
//	}
//	void method4(){
//		System.out.println("In Method 4 ");
//	}
	void method5(){
		System.out.println("In Method 5 ");
	}
	void method6(){
		System.out.println("In Method 6 ");
	}
	
	
}