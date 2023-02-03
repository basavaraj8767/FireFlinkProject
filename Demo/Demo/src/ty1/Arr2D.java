package ty1;

import java.util.Scanner;

public class Arr2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row = sc.nextInt();
		int[][] arr = new int[row][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array size");
			arr[i] = new int[sc.nextInt()];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
