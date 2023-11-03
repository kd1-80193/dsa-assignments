package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {

	public static int bubbleSort(int arr[], int size) {
		int temp;
		int count = 0;
		int passes = 0;
		int flag;
		for (int i = 1; i < size; i++) {
			passes++;
			flag = 0;
			for (int j = 0; j < size-i; j++) {
				count++;
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag =1;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("Number of passes in bubble sort: " + passes);
		System.out.println("Number of comparisions in bubble sort: " + count);
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 1, 5, 8 };
		int size = arr.length;
		System.out.println("Array before sort : " + Arrays.toString(arr));
		bubbleSort(arr, size);
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
