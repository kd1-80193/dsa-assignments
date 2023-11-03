package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		int temp = 0, count = 0, passess = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			passess++;
			for (int j = i + 1; j < arr.length; j++) {
				count++;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("No. of Comparisons : " + count);
		System.out.println("No. of Passess : " + passess);
	}

	public static void main(String[] args) {
		int[] arr = { 33, 22, 55, 77, 11 };

		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Array before sort : " + Arrays.toString(arr));

	}

}
