package project1;

public class Overloading {

	public void method(){
		System.out.println("0-Orgu method");
	}
	
	public void method(int x){
		System.out.println("1-Orgu method");
	}
	public void method(int x , int y ){
		System.out.println("2-Orgu method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Overloading obj  = new Overloading();
		obj.method();
		obj.method(100);
		obj.method(200, 300);
	}

}
