package com.sunbeam;

public class NonReapiting {

	public static int nonReapitingElement(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int index = nonReapitingElement(arr);
		if (index != -1)
			System.out.println("ELement = " + index);
		else
			System.out.println("Not Present");
	}

}
