package week3.day3;

public class LearnStringMethods {
public static void main(String[] args) {
	String text="Good Morning";
	int length = text.length();
	System.out.println(length);
	
	
	
	char[] charArray = text.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		//System.out.println(charArray[i]);
	}
		
		String words="I,love,india";
		boolean contains = words.contains("love");
		System.out.println(contains);
		String[] split = words.split(",");
	//	System.out.println(split.length);
		
		
//		String text1=new String("Tamil");
//		String text2=new String("tamil");
//	   if(text1.equalsIgnoreCase(text2)) {
//		   System.out.println("both are equal");
//	   }else {
//		   System.out.println("not equal");
//	   }
		
		String text1=new String("i love india");
		
	   if(text1.contains("love")) {
		  // System.out.println("both are equal");
	   }else {
		   System.out.println("not equal");
	   }
		
		String email="aravind440@gmail.com";
		//String replaceAll = email.replaceAll("[^0-9]", "");
		//String replaceAll = email.replaceAll("\\D", "");
		//String replaceAll = email.replaceAll("\\d", "");
		String replaceAll = email.replaceAll("[^A-z a-z]", "");
		System.out.println(replaceAll);
		
	
}
}


