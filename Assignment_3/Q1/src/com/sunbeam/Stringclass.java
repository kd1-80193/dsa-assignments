package com.sunbeam;

public class Stringclass {

	public static void main(String[] args) {
		String str = "22 23 21";
		// System.out.println(str);
		String[] a = str.split(" ");
		int size = a.length;
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(a[i]);
		}
		for (int b : arr)
			System.out.println("element = " + b);
		System.out.println(size);

	}

}
