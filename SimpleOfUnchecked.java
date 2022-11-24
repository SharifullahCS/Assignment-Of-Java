package SimpleOfUnchecked;

import java.rmi.AccessException;

public class SimpleOfUnchecked {

	public static void main(String[] args) {
		
		int x;
		System.out.println("Hello World ! ");
		try{
			x=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling !!! ");
		}
		System.out.println("The End!!!!");
		
	}

}
