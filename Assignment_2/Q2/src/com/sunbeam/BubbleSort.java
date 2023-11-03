package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int temp = 0, count = 0, passess = 0, flag = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			passess++;
			for (int j = 0; j < arr.length - i - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag++;
				}
			}
		}
		System.out.println("No. of Passess : " + passess);
		System.out.println("No. of Comparisons : " + count);
		System.out.println("No. of Actual Comparisons : " + flag);

	}

	public static void main(String[] args) {

		int arr[] = { 55, 22, 33, 44, 11 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Array after bubble sort : " + Arrays.toString(arr));
	}

}
