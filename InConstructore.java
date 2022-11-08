package InhrFinalThisSupr;

class Con{
	Con(){
		System.out.println("I'm Con  0_argu Constructor !!! ");
		
	}
	
}


class Con_ex extends Con{
	Con_ex(){		// Constructor
		this(20);
		System.out.println("I'm B_Class  0_argu Constructor !!! ");
	}
	
	Con_ex(int x){		// Constructor
		System.out.println("I'm B_Class  1_argu Constructor !!! "+x);
	}
}







public class InConstructore {
	public static void main(String[] args) {
		
		Con_ex obj1=new Con_ex(20);
		
		
		
		
	}

}