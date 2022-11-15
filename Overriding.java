package project1;

class father{
	
	public void m1(){
		System.out.println("i am m1 in father class . ");
	}
	
	public void display(){
		System.out.println("I am method1 from father class.");
	}
}
class child extends father{
	public void m1(){
		System.out.println("i am m1 in child class.");
	}
	public void show(){
		System.out.println("I am method1 in child class.");
	}
	
}
public class Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child obj = new child();
//		obj.display();
//		obj.show();
		obj.m1();
	}

}
