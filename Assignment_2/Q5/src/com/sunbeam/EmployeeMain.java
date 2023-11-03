package com.sunbeam;

import java.util.Arrays;

public class EmployeeMain {

	public static void bubbleSort(Employee[] arr) {
		Employee temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j].getSalary() > arr[j + 1].getSalary()) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(105, "john", 3000);
		arr[1] = new Employee(102, "Henry", 9000);
		arr[2] = new Employee(101, "Rohit", 7000);
		arr[3] = new Employee(103, "Virat", 5000);
		arr[4] = new Employee(104, "Gautam", 6000);

		bubbleSort(arr);
		for (Employee e : arr) {
			System.out.println(e);
		}

	}

}
