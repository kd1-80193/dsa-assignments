package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static int selectionSort(int arr[], int size) {
		int temp;
		int count = 0;
		int passes = 0;
		for (int i = 0; i < size - 1; i++) {
			passes++;
			for (int j = i+1; j < size; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
			}
		}
		System.out.println("Number of passes in selection sort: "+passes);
		System.out.println("Number of comparsions in selection sort: "+count);
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 23, 54, 1, 5, 38,45};
		int size = arr.length;
		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
