package HierarchicalInheratance;
import java.util.*;



public class D_Salary_exta_A extends BPersonalInfo{
	int salary;
	int bones;
	int rent;
	int ebill;
	int tax;
	void setSalary(int salary,int bones,int ren,int eb,int t){
		this.salary=salary;
		this.bones=bones;
		rent=ren;
		ebill=eb;
		tax=t;
		
	}
	void Show_sal(){
		System.out.println("Net_Sal:"+(salary+bones-rent-ebill-tax));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}