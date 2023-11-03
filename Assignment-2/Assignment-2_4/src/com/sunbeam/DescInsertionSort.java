package com.sunbeam;

import java.util.Arrays;

public class DescInsertionSort {

	public static void descInsertionSort(int arr[],int size) {
		for(int i = 1; i< size; i++) {
			int j = i - 1;
			int temp = arr[i];
			while(j>=0&& arr[j]<temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		
    int arr[] = {11,43,2,66,7,10};
    int size = arr.length;
    System.out.println("Array before sort: "+ Arrays.toString(arr));
    descInsertionSort(arr, size);
    System.out.println("ArraY after sort: "+ Arrays.toString(arr));
	}

}
