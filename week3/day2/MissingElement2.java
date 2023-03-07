package week3.day2;

import java.util.Arrays;

public class MissingElement2 {
public static void main(String[] args) {
	int[] number= {1,4,8,2,3,6,7};
	//output: 5
	//sort the Array in Ascending order
	Arrays.sort(number);
	
	int sum1=0;
	for (int i = 1; i <=8; i++) {
		sum1=sum1+i;
	}
	System.out.println(sum1);
	
	int sum2=0;
	for (int i = 0; i < number.length; i++) {
		sum2=sum2+number[i];
	}
	System.out.println(sum2);
	
	int sum3=sum1-sum2;
	System.out.println("Missing Element is "+sum3);
	
}
}
