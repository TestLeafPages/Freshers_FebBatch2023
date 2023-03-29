package week6.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList2 {
	public static void main(String[] args) {
		List<String> name=new LinkedList<String>();
		
		name.add("Kabilan");
		name.add("Anwar");
		name.add("Anto");
		name.add("Eshwa");
		name.add("Vishnu");
		name.add("Kabilan");
		
		int size = name.size();
		System.out.println(size);
		
		//name.add(0, "Aravind");
		Collections.sort(name);
		System.out.println(name);
		
		
		//name.remove(2);
		name.remove("Anwar");
		System.out.println(name);
		
		name.clear();
		System.out.println(name);
		boolean empty = name.isEmpty();
		System.out.println(empty);
	//	System.out.println(name);
//		Collections.reverse(name);
//		System.out.println(name);
//		
//		for (int i = 0; i < name.size(); i++) {
//			String string = name.get(i);
//			System.out.println(string);
//		}
	}
	

}
