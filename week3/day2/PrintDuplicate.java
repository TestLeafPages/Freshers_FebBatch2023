package week3.day2;

public class PrintDuplicate {
public static void main(String[] args) {
	int[] num= {1,4,6,8,2,3,4,1,8};
	//1,4,8
	//Iterate the values o to array length
	for (int i = 0; i < num.length; i++) {
		//add the inner loop ,it start with j=i+1
		for (int j = i+1; j < num.length; j++) {
			//check both array are equal
			if (num[i]==num[j]) {
				//if it is equal print duplicate number
				System.out.println(num[i]);
			}
		}
	}
	
	
	
	
}
}
