package Class;
import java.io.*;
import java.util.*;
// Implementation of Aggregation in Java Class work part - 3.
class Student{
	// Attributes of student
	String name;
	int id;
	String dept;
	
	// constructor of student class 
	Student (String name, int id ,String dept){
		// This keyword referes to current instance itself
		this.name=name;
		this.id=id;
		this.dept=dept;
		
	}
}

// class 2 
// Department class contains list of students objects.
// it is associated with student class through its objects
class Department{
	// Attributes of Department class 
	String name;
	private List<Student> students;
	Department(String name, List<Student> students){
		this.name=name;
		this.students=students;
		
	}
	// Method of Department class 
	public List<Student> getStudents(){
		// Returning list of user defined type.
		// Student type.
		return students;
	}
	
}
// Class 3
// Institute class contains list of Department
// Objects. it is associated with Department
// class through its Objects
class Institute{
	// Attributes of Institute;
	String instituteName;
	private List<Department> departments;
	// constructor of institute class 
	Institute(String instituteName,List<Department>departments)
	{
		// This keyword refers to current instance itself
		this.instituteName=instituteName;
		this.departments=departments;
		
	}
	// Method of Institute class 
	// Counting Total Students of all departments
	// in a given institute
	public int getTotalStudentsInInstitute()
	{
		int noOfStudents=0;
		List<Student> students;
		
		for(Department dept: departments){
			students = dept.getStudents();
			
			for(Student s : students ){
				noOfStudents++;
				
			}
		}
		return noOfStudents;
	}
}
// Class 4;
// main class 

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Object of Student class inside main()
		Student s1 = new Student ("Ali", 1, "DIT");
		Student s2 = new Student ("Khan", 2, "CIT");
		Student s3 = new Student ("Khalid",3,"SIT");
		Student s4 = new Student ("Tam" , 4,"MIT");

		// Creating a List of CIT Students
		List < Student> cit_students = new ArrayList <Student>();
		// Adding CIT Students
		cit_students.add(s1);
		cit_students.add(s2);
		
		// Creating a List of DIT Students
		List<Student> dit_students = new ArrayList<Student>();
		// Adding DIT Students
		dit_students.add(s3);
		dit_students.add(s4);
		// Creating Objects of DIT and CIT class inside Main();
		Department CIT = new Department("CIT",cit_students);
		Department DIT = new Department("DIT",dit_students);
		
		List <Department> departments = new ArrayList<Department>();
		departments.add(CIT);
		departments.add(DIT);
		
		// Lastly creating an instance of Institute
		Institute institute  = new Institute("Cs",departments);
		// Display message for better readability
		System.out.println("Total students in institute: ");
		// calling method to get total number of students
		// in institute and printing on console
		System.out.println(institute.getTotalStudentsInInstitute());
		
		
		 dit_students.add(s4);
		 
	}

}
