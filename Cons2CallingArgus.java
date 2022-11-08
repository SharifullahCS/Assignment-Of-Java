package BasicConstructors;

public class Cons2CallingArgus {
	
	Cons2CallingArgus(){
		System.out.println("0- Argu Cons ......... ");
		System.out.println("........ Empty............");
	}
	Cons2CallingArgus(int x){
		System.out.println("1- Argu Constructor //// ");
		System.out.print("......... Value is = "+x+" \n");
	}
	Cons2CallingArgus(int a,int b){
		System.out.println("2-Agus Constractor's **** ");
		System.out.print("......... Value r = "+a+" & "+b+" \n");
	}
	
	
	public static void main(String[] args) {
		Cons2CallingArgus obj1=new Cons2CallingArgus();
		
		Cons2CallingArgus obj2=new Cons2CallingArgus(1000);
		Cons2CallingArgus obj3=new Cons2CallingArgus(800,3400);
		
		
		
	}

}
