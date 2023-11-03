package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[], int N) {
		int passes = 0;
		int count = 0;
		for (int i = 1; i < N; i++) {
			passes++;
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
				count++;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Number of passes: " + passes);
		System.out.println("Number of count: " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}
}
