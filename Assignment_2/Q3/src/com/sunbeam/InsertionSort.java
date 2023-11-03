package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int temp = 0, count = 0, j, passess = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			passess++;
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				count++;
				arr[j + 1] = arr[j];

			}
			arr[j + 1] = temp;
		}
		System.out.println("No. of Passess : " + passess);
		System.out.println("No. of Comparisons : " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 44, 33, 55, 11, 22 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array after  sort : " + Arrays.toString(arr));
	}

}
