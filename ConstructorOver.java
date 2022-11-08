package CompileTime;

public class ConstructorOver {
	int s;
	ConstructorOver() {
		s=80;			//Unchangible Cons Var!
		System.out.println("Zero parameter Cons....Sum="+s);
	}
	
	ConstructorOver(int x){
		s=x;			//Changible Cons Value!!!
		System.out.println("One parameter Cons.... Sum="+s);
	}
	
	
	
	public static void main(String[] args) {
		ConstructorOver obj1=new ConstructorOver();
		ConstructorOver obj2=new ConstructorOver(2400);
		
	}

}
