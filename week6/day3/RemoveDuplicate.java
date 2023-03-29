package week6.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,6,2,4,};
	
	Set<Integer> val=new LinkedHashSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		if(!val.add(num[i])) {
			System.out.println(num[i]);
		}
	}
	
	//System.out.println(val);
	for (Integer integer : val) {
		System.out.println(integer);
	}
	
	List<Integer> number=new ArrayList<Integer>(val);
	
	
	Integer min = Collections.min(number);
	System.out.println("min  "+min);
	System.out.println("Minimum Value "+number.get(0));
	
	Integer max = Collections.max(number);
	System.out.println("max  "+max);
	System.out.println("Maximum Value "+number.get(number.size()-1));
}
}
