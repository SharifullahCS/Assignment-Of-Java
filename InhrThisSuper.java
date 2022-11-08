package InhrFinalThisSupr;

class Aa{
	Aa(int x){
		System.out.println(x+" argu Super class construtor !!! \n");
		
	}
	
}








class Bb extends Aa{
//	Bb(){		//1. Pass Specific Value here!!!
//		super(100);
//		System.out.println("\n2-argu Child class construtor !!!");
//	}
	
	
	Bb(int x){		///// You can pass value from user Choice(DefrintV) 
		super(x);
	}
	Bb(){			//second Constructor
		super(5);
		
	}
	Bb(int x,int b){	//3rd Constructor
		super(20);
		
	}
	
}


public class InhrThisSuper {
	public static void main(String[] args) {
//		Bb obj1=new Bb();		//1.........
		
		Bb obj1=new Bb(300);		//1 . 1_Bar Pass value Here 
		Bb obj2=new Bb(3000);		//1 . 2_Bar
		
		Bb obj3=new Bb();		//1_Bar
		Bb obj4=new Bb(80,700);		//1_Bar
		
		
		
		
		
	}

}
