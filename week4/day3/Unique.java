package week4.day3;

import java.util.Arrays;

public class Unique {
	
	public static void uni(int num[]) {
	
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {	
				if(num[i]!=num[i+1]) {
					System.out.println(num[i+1]);
					break;
				}
		}	
	}
public static void main(String[] args) {
	int[] num= {1,5,7,2,5,5,1,7,7,1,5,1};
	uni(num);
}
}
