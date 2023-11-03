package com.sunbeam;

import java.util.Scanner;

public class OccurenceOfGivenElement {

	public static int linearSearch(int arr[], int size, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				count++;
			}
		}
		System.out.println("Total number of occurence of key in the array: " +count);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {12,34,56,45,32,12,34,90,12,56,89,12};
		int size = arr.length;
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key for searching the occurence of element: ");
		key = sc.nextInt();
		linearSearch(arr,size, key);

	}

}
