package test;

public class Java_method_example {
	
	public static void main (String[] args) {
	StringBuilder str = new StringBuilder("jiangwei"); // StringBuilder is a list to store String type 
	String a = " ";
	String b = "shi";	
	str.append(a,0,1);
	str.append(b,0,3);	
	System.out.println(str);
	}
}
