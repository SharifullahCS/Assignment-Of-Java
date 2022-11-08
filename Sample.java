package MethodOver;

class father{
	public void m1(){
		System.out.println("I'm M1 of Father ");
	}
	
	public void show(){
		System.out.println("Father class ; ");
	}
}




class son extends father{
	public void m1(){
		System.out.println("I'm M1 of Child ");
	}
	public void display(){
		System.out.println("Dispalay Son With Father ");
	}
	
}

public class Sample {
	public static void main(String[] args) {
		son obj1=new son();
		
		obj1.m1();
//		obj1.show();
//		obj1.display();
		
	}

}
