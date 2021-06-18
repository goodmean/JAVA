import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		int a0 = 1;

		int[] arr = new int[3];

		int[] arr2 = arr;

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(arr[2]);

		System.out.println(arr2[2]);
		
	}
}
