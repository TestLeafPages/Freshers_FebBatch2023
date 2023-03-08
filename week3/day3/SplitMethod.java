package week3.day3;

public class SplitMethod {
public static void main(String[] args) {
	String text="Amazon has 20,000 employees @ &in chennai";
	
	String replaceAll = text.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	
	boolean contains = text.contains("employees @ &in chennai");
	System.out.println(contains);
	
	String m1="Testleaf";
	String m2="testleaf";
	if(m1.equalsIgnoreCase(m2)) {
		System.out.println("both are equal");
	}else {
		System.out.println("not equal");
	}
	
}
}
