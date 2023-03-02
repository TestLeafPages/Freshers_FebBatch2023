package week2.day3;

import java.util.Arrays;

public class SqureMatrix {
public static void main(String[] args) {
	 int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

     int[][] squaredMatrix = new int[matrix.length][matrix[0].length];

     for (int i = 0; i < matrix.length; i++) {
         squaredMatrix[i] = Arrays.stream(matrix[i]).map(x -> x * x).toArray();
     }

     // Print the squared matrix
     for (int[] row : squaredMatrix) {
         System.out.println(Arrays.toString(row));
     }
}
}
