
public class StringClass {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		String str2=new String("Hello");
		
		System.out.println("Str == Str1    "+(str == str1));
		System.out.println("Str1 == Str2    "+(str1 == str2));
		System.out.println("Str1.isEquals(Str2)   "+(str1.equals(str2)));
		System.out.println();
		System.out.println();
		
	}

}
