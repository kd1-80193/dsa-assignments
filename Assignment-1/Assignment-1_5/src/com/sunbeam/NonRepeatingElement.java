package com.sunbeam;

public class NonRepeatingElement {

	public static int nonRepeat(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = 0; j < size; j++) {
				if (i != j && arr[i] == arr[j])
					break;
			}
			if (j == size)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int size = arr.length;
		System.out.println(nonRepeat(arr, size));
	}

}
