package com.sunbeam;

import java.util.Scanner;

public class BinaryDescending {

	public static int binarySearch(int arr[],int size, int key) {
		int l =0 ;
		int r = size -1;
		while(l<=r) {
			int mid  = (l+r)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]){
				l = mid + 1;
			}
			else {
				r = mid  -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	int arr[] = {90,82,76,56,32,12};
	int size = arr.length;
	int key;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter key for searching: ");
	key = sc.nextInt();
	int index = binarySearch(arr, size,key);
	System.out.println("Key found at index: "+index);
	}

}
