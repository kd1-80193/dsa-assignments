package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

	public static String binarySearch(int[] arr, int size, int key) {

		int count = 0;
		int left = 0;
		int right = arr.length - 1;
		int mid;

		System.out.println();
		while (left <= right) {
			count++;
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				return count + " and ELement At index = " + mid;

			} else if (key < arr[mid]) {
				right = mid - 1;
			} else // (key > arr[mid])
			{
				left = mid + 1;
			}
		}
		return "" + -1;
	}

	public static void main(String[] args) {
		int[] arr = { 22, 33, 55, 77, 11 };

		System.out.println("Enter key to search");
		int key = new Scanner(System.in).nextInt();
		String cnt = binarySearch(arr, arr.length, key);
		if (cnt != "-1")
			System.out.println("The no. of Comparisons = " + cnt);
		else
			System.out.println("Element is not present");

	}

}

/*
 * public class Binary {
 * 
 * public static void binarySearch(int[] arr, int size, int key) {
 * 
 * int count = 0; int left = 0; int right = arr.length - 1; int mid;
 * 
 * while (left <= right) { count++; mid = (left + right) / 2; if (key ==
 * arr[mid]) { System.out.println("Element found At index = " + mid); break; }
 * else if (key < arr[mid]) { right = mid - 1; } else if (key > arr[mid]) { left
 * = mid + 1; } } System.out.println("The no. of Comparisons = " + count); }
 * 
 * public static void main(String[] args) { int[] arr = { 22, 33, 55, 77, 11,
 * 44, 88 };
 * 
 * System.out.println("Enter key to search"); int key = new
 * Scanner(System.in).nextInt(); binarySearch(arr, arr.length, key); //
 * System.out.println("The no. of Comparisons = " + cnt);
 * 
 * }
 * 
 * }
 */
