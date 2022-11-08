package BasicConstructors;

public class ConsCallAnotherCons {
	
	
	ConsCallAnotherCons(){
		this(300);
		System.out.println("Automatically Cons ");
		
	}
	
	
	ConsCallAnotherCons(int x){
		
		System.out.println("One Argus Cons ! ");
	}
	
	
	
	
	
	ConsCallAnotherCons(int a,int b){
		this(300);
		System.out.println("\nCalling 1st one again; ");
		System.out.println("Tow Argus Cons ! ");
		
	}
	public static void main(String[] args) {
		ConsCallAnotherCons obj1=new ConsCallAnotherCons();
		System.out.println("...............................");
		
		ConsCallAnotherCons obj2=new ConsCallAnotherCons(500);
		System.out.println("...............................");
		
		ConsCallAnotherCons obj3=new ConsCallAnotherCons(800,900);
		System.out.println("...............................");
		
		

	}

}
