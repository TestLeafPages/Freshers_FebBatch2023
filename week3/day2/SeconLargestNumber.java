package week3.day2;

import java.util.Arrays;

public class SeconLargestNumber {
public static void main(String[] args) {
	int[] number={1,5,9,2,6,3,5,4,8,7};

	//sort the Array
	Arrays.sort(number);

	//to get the size of Array
	int size=number.length;
	//get the second largest number
	System.out.println(number[size-2]);
}
}
