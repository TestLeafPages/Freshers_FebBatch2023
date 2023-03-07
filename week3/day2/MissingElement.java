package week3.day2;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	int[] number= {1,4,8,2,3,6,7};
	//output: 5
	//sort the Array in Ascending order
	Arrays.sort(number);
	//iterate the values from 0 to Array length
	for (int i = 0; i < number.length; i++) {
		//to check the index value if not matched print the missing number
		if(number[i]!=i+1) {
			System.out.println(i+1);
			break;
		}
	}
}
}
