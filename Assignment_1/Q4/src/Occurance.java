import java.util.Scanner;

/*Implement linear search algorithm to find the nth occurence of the given element.
 *  If nth occurrence is not found, return -1.*/
public class Occurance {

	public static int nthOccurance(int arr[], int key, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				count++;
				if (count == n)
					return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 11, 22, 33, 44, 11, 33, 55 };
		
		System.out.print("Enter Key to search = ");
		int key = sc.nextInt();
		System.out.print("Enter Occurence Number ");
		int n = sc.nextInt();
		
		int index = nthOccurance(arr, key, n);
		if (index != -1)
			System.out.println("Element found at index = " + index);
		else
			System.out.println("Element is not present");
	}

}
