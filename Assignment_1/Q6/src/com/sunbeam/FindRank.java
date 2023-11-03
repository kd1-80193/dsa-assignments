package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

/*6. to find rank of an element in a stream of integers.
rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
	
	Input: { 10, 20, 15, 3, 4, 4, 1 }
	Ouput: Rank of 4 is: 4*/
public class FindRank {
	public static int findRank(int arr[], int key) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= key) {
				count++;
			}
		}
		if (count == 0) {
			return -1;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the element");
		int key = new Scanner(System.in).nextInt();
		int rank = findRank(arr, key);
		if (rank != -1)
			System.out.println("Rank of " + key + " is : " + rank);
		else
			System.out.println("Element is not present");
	}

}
