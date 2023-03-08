package week3.day3;

public class LearnSplitMethod {
public static void main(String[] args) {
	String  text="I like     chicken      briyani";
	String[] split = text.split("\\s+");
	int length = split.length;
	System.out.println(length);
	
	int count=0;
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		//count=count+1;
		count++;
	}
	
	System.out.println("count"+count);
}
}
