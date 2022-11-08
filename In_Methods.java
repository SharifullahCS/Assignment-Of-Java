package InhrFinalThisSupr;

class G{
	
	int add(){
		int a=10;
		int b=20;
		int total=a+b;
		return total;
	}
	
}




class Total extends G{
	

	int add(){
		int a=100;
		int b=200;
		int total=a+b;
		return total;
		
	}
	
	void display(){
		System.out.println("Sum = "+super.add());	// (Super) For call to the other extended Class!!!
		System.out.println("Total = "+this.add());	// (This) For here add() fun's of Same Class!!!
		
	}
	
}











public class In_Methods {

	public static void main(String[] args) {
//		new B().display();
		////// OR
		Total obj1=new Total();
		obj1.display();
		
	}

}
