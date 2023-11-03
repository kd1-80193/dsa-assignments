package com.sunbeam;

import java.util.Scanner;

/*1. Write a program to print no of comparisions done to search a key in
	i. linear search
	ii. binary serach*/
/*
public class Search1 {

	public static int linearSearch(int arr[], int key, int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (key == arr[i]) {

				return count;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 22, 33, 55, 77, 11, 44, 88 };

		System.out.println("Enter key to search");
		int key = new Scanner(System.in).nextInt();
		int cnt = linearSearch(arr, key, arr.length);
		System.out.println("No. of Comparisons = " + cnt);
	}

}*/

public class Linear {

	public static void linearSearch(int arr[], int key, int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (key == arr[i]) {
				System.out.println("key found at index = " + i);
				break;
			}
		}
		System.out.println("No. of Comparisons = " + count);
	}

	public static void main(String[] args) {
		int[] arr = { 22, 33, 55, 77, 11, 44, 88 };
		
		System.out.println("Enter key to search");
		int key = new Scanner(System.in).nextInt();
		linearSearch(arr, key, arr.length);

	}
}
