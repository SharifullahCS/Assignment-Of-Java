package project1;

abstract class A{
	
	public void display(){
		System.out.println("i am parent display method.");
		
	}
		abstract public void show();
		abstract public void present();
}

public class Test extends A {

	public void show(){
		System.out.println("i am parent show method");
	}
	public void present(){
		System.out.println("i am parent present method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new Test();// parent reference & child class object creation.
		obj.display();
		obj.show();
		obj.present();
		
	}

}