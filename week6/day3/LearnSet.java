package week6.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> name=new LinkedHashSet<String>();
	//hashSet [Vishnu, Kabilan, Eshwa, Anto, Anwar]
  //treeSet [Anto, Anwar, Eshwa, Kabilan, Vishnu]
	//LinkedHashSet  [Kabilan, Anwar, Anto, Eshwa, Vishnu]
	boolean add = name.add("Kabilan");
	System.out.println(add);
	name.add("Anwar");
	name.add("Anto");
	name.add("Eshwa");
	name.add("Vishnu");
	boolean add2 = name.add("Kabilan");
	System.out.println(add2);
	
	for (String localVariableName : name) {
		System.out.println(localVariableName);
	}
	System.out.println(name);
	
	
}
}
