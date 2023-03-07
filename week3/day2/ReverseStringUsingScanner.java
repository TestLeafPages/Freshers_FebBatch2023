package week3.day2;

import java.util.Scanner;

public class ReverseStringUsingScanner {

	public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
	 System.out.println("Enter your name");
      String nextLine = scan.nextLine();
      
      
		char[] character= nextLine.toCharArray();
		for(int i=character.length-1;i>=0;i--)
		{
			System.out.print(character[i]);
		}
		
	}

}
