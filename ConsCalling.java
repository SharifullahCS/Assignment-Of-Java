package BasicConstructors;


public class ConsCalling {
	int sal=90000;
	
	ConsCalling(){		///////1. This is User Define Constructor!................
		System.out.println("User difine (0) arguments Constructore : ");
		
	}/*
	*ConsCalling(){       // 2. If up is not exist Then/, This Empty OR Default Cons will be run Automatically !!!
	*	
	}*/
	
	

	public static void main(String[] args){
		
		ConsCalling obj=new ConsCalling();	//object 1 Make. Cons 1-time call.
		System.out.println("1. "+obj.sal);
		
		ConsCalling obj2=new ConsCalling();	//object 2 Make. Cons call Again.
		System.out.println("2. "+obj2.sal);
		
		ConsCalling obj3=new ConsCalling();	//Object 3 Created. Cons calls Automatically!!
		System.out.println("2. "+obj3.sal);
		
		
		
		
		
		
	}

}
