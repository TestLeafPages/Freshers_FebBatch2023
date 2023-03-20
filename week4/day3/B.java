package week4.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	System.out.print("Please enter the number of strings you want to enter: ");   
	//takes an integer input         
	int[] val = new int [sc.nextInt()];      
	//consuming the <enter> from input above  
	sc.nextLine();   
	for (int i = 0; i < val.length; i++)   
	{  
	val[i] = sc.nextInt();  
	}  
	List<Integer> unique=new ArrayList<Integer>();
	 for (int i = 0; i < val.length; i++) {
		unique.add(val[i]);
	}
	 System.out.println(unique);
}
}
