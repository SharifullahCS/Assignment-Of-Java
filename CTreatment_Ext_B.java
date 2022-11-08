package HierarchicalInheratance;




public class CTreatment_Ext_B extends BPersonalInfo{
	String problem;
	int payment;
	void add_problem(String problem,int payment){
		this.problem=problem;
		this.payment=payment;
	}
	
	void Show_problem(){
		System.out.println("Problem:"+problem);
		System.out.println("Payment:"+payment);
		
	}
	



	public static void main(String[] args) {
	}
}
