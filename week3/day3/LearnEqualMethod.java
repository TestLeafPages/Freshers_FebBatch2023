package week3.day3;

public class LearnEqualMethod {
public static void main(String[] args) {
	String text="Test";
	text="leaf";
	System.out.println(text);
	
	String m1="Testleaf";
	String m2="Testleaf";
	
	//a==b  .equal
	
	if(m1==m2) {
		System.out.println("Both are equal");
	}else {
		System.out.println("not equal");
	}
	
	String text1=new String("Qeagle");
	String text2=new String("qeagle");
	boolean equals = text1.equals(text2);
    System.out.println(equals);
	if(text1.equals(text2)) {
		System.out.println("Both are equal");
	}else {
		System.out.println("not equal");
	}
	
	
}
}
