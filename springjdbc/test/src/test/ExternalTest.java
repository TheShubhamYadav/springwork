package test;

public class ExternalTest {
public static void main(String[] args) {
	String str = "notgood";
	System.out.println( str.charAt(str.length()-1)+""+str.substring(1,str.length()-1)+""+str.charAt(0));
}
}
