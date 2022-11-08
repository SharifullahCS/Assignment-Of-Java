package HierarchicalInheratance;
import java.util.*;

public class BPersonalInfo{
	String name;
	String f_name;
	int id;
	String address;
	String email;
	
	void perInfo(String nam,String father_name,int id,String email,String add){
		name=nam;
		f_name=father_name;
		this.id=id;
		this.email=email;
		address=add;
	}
	void Show_perInfo(){
		System.out.println("\n.................... Your Entery ................");
		System.out.println("ID  :  Name       : Son_of         :   Email                        :  Address           : ");
		System.out.println("                                  "+id+" : "+name+"    :"+f_name+"      :"+email+"                       :"+address+"         :");
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}

