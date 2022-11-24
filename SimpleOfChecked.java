package SimpleOfChecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class SimpleOfChecked {

	public static void main(String[] args) {
		
		System.out.println("HI ,,,,,,,,,,,,,");
		try{
			FileInputStream file=new FileInputStream("Khan.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("Exception Handled......");
		}
		
		System.out.println("The End........");
	}

}