package com.sunbeam;

import java.util.Scanner;

public class Rank {

	public static void linearSearch(int arr[], int size, int ele) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] <= ele) {
				count++;
			}
		}
		System.out.println("rank of the element: "+count);

	}

	public static void main(String[] args) {
        int ele;
		int arr[] = { 33, 5, 32, 1, 21, 65, 89, 90, 34, 56, 76 };
		int size = arr.length;
        System.out.print("Enter element to find it's rank: ");
        Scanner sc = new Scanner(System.in);
        ele = sc.nextInt();
        linearSearch(arr,size,ele);
	}

}
