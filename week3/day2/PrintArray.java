package week3.day2;

import java.util.Arrays;

public class PrintArray{

	public static void main(String[] args){

		int[] data={1,2,3,4,5};

		//to get the size of Array
		int size=  data.length;

		Arrays.sort(data);
//		for(int i=0;i<size;i++){
//			System.out.println(data[i]);
//		}

		System.out.println(Arrays.toString(data));

	}
}
