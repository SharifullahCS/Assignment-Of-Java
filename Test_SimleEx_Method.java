package InhrFinalThisSupr;

class Show_Sent{
	
	void message(){
		System.out.println("I'm messege of Super class ");
	}
}


class D extends Show_Sent{
	void message(){
		System.out.println("\nI'm message of Child class. ");
	}
	
	void display(){
//		massage();
		super.message();
		this.message();
	}
	
}





public class Test_SimleEx_Method {
	public static void main(String[] args) {
		
//		new D().display();
		D obj1=new D();
		obj1.display();
		
		
		
		
	}

}
