package week2.day3;

public class SumOfDigit {
public static void main(String[] args) {
	 int sum = 0;
     for (int i = 1; i <= 200; i++) {
         if (i % 2 == 1) { // Check if the number is odd
             sum=sum+i;
             
         }
     }
     System.out.println("Sum of odd digit numbers from 1 to 200 is " + sum);
 }
}
