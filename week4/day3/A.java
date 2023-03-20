package week4.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);  
	    	System.out.print("Please enter the number of strings you want to enter: ");   
	    	//takes an integer input         
	    	String[] string = new String [sc.nextInt()];      
	    	//consuming the <enter> from input above  
	    	sc.nextLine();   
	    	for (int i = 0; i < string.length; i++)   
	    	{  
	    	string[i] = sc.nextLine();  
	    	}  
//	        Scanner scanner = new Scanner(System.in);
//	        List<Integer> numbers = new ArrayList<Integer>();
//	        System.out.println("Enter the number");
//	        int nextInt = scanner.nextInt();
//	        for (int i = 0; i < args.length; i++) {
//				
//			}
//	        
//	        
//	        for (int num : numbers) {
//	            System.out.println(num);
//	        }
//	        scanner.close();
	    }
	
}
