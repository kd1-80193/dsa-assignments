package com.sunbeam;

import java.util.Scanner;

public class Search {

	public static void linearSearch(int arr[], int size, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
//				System.out.println("Key found at: " + i);
			}
			count = count + 1;
		}
		System.out.println("Linear Count: " + count);

	}

	public static void binarySearch(int arr[], int size, int key) {
		int l = 0;
		int r = size - 1;
		int count = 0;
		int mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (key == arr[mid])
				System.out.println("Binary Key found at: " + mid);
			else if (key < arr[mid])
				r = mid - 1;
			else
				l = mid + 1;
			count = count + 1;
		}

		System.out.println("Binary count: " + count);
	}

	public static void main(String[] args) {

		int arr[] = { 3, 51, 23, 82, 90, 1, 45, 67, 89 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		int size = arr.length;
		binarySearch(arr, size, key);
		linearSearch(arr, size, key);

	}

}
