import java.util.Arrays;
import java.util.Scanner;

public class BinaryDesc {

	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2; // 2
			if (key == arr[mid]) {
				return mid;

			} else if (key < arr[mid]) {
				left = mid + 1;
			} else // (key > arr[mid])
			{
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 88, 77, 66, 55, 44 };

		System.out.println("Enter key to search");
		int key = new Scanner(System.in).nextInt();
		int cnt = binarySearch(arr, key);
		if (cnt != -1)
			System.out.println("Element At Index = " + cnt);
		else
			System.out.println("Element is not present");

	}

}
