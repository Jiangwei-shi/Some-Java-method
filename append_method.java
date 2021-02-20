package test;

public class append_method {
	public static void main (String[] args) {
	StringBuilder str = new StringBuilder("Jiangwei"); // StringBuilder is a list to store String type 
	String a = " ";
	String b = "Shi";	
	str.append(a,0,1);		//append method can add the a String's character from 0 to 1 into str
	str.append(b,0,3);		//append method can add the b String's character from 0 to 3 into str
	System.out.println(str);
	}
}
