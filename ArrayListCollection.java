package basics;

import java.util.*;
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		//Creating arraylist 
		ArrayList<String> list=new ArrayList<String>(); 
		ArrayList mlist=new ArrayList();
		
		//Adding object in arraylist 
		list.add("Sharifullah"); 
		list.add("Irfanullah");  
		mlist.add(300);  
		mlist.add(200);  
		mlist.add("Abadullah Ahmadi");
		mlist.add("Ahmad Gul");
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
//		while(itr.hasNext()){
			System.out.println(itr.next());
			System.out.println("");
			System.out.println(mlist);
			System.out.println("");
			
			
//		}
		
		System.out.println("The End.........!");
	}
}
