package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Search2 {
	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Search Employee by ID ");
		System.out.println("2. Search Employee by Name ");
		System.out.println("3. Search Employee by Salary ");
		System.out.print("Enter your choice - ");
		int choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static String searchById(Employee arr[], int size, int key) {
		for (int i = 0; i < size; i++) {
			if (key == arr[i].getId()) {
				return arr[i] + " At index " + i;
			}
		}
		return -1 + "";
	}

	public static String searchByName(Employee arr[], int size, String key) {
		for (int i = 0; i < size; i++) {
			if (key.equals(arr[i].getName())) {
				return arr[i] + " At index " + i;
			}
		}
		return -1 + "";
	}

	public static String searchBySalary(Employee arr[], int size, double key) {
		for (int i = 0; i < size; i++) {
			if (key == arr[i].getSalary()) {
				return arr[i] + " At index " + i;
			}
		}
		return -1 + "";
	}

	public static void main(String[] args) {
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Employee[] arr = new Employee[size];
		arr[0] = new Employee(105, "john", 3000);
		arr[1] = new Employee(102, "Henry", 9000);
		arr[2] = new Employee(101, "Rohit", 7000);
		arr[3] = new Employee(103, "Virat", 5000);
		arr[4] = new Employee(104, "Gautam", 6000);
		for (Employee e : arr)
			System.out.println(e);
		System.out.println("-----------------------------");
		// By name
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:// By ID
			{
				System.out.println("Enter Id to Search ");
				int key = sc.nextInt();
				String id = searchById(arr, size, key);
				if (id != -1 + "")
					System.out.println("Id found " + id);
				else
					System.out.println("Id Not Found");
			}
				break;
			case 2: {
				System.out.println("Enter Name to Search");
				String key = sc.next();
				String name = searchByName(arr, size, key);
				if (name != -1 + "") {
					System.out.println("Name found " + name);
				} else
					System.out.println("Name Not Found");
			}
				break;
			case 3: {
				System.out.println("Enter Salary to Search");
				double key = sc.nextDouble();
				String salary = searchBySalary(arr, size, key);
				if (salary != -1 + "") {
					System.out.println("Salary Found " + salary);
				} else
					System.out.println("Salary Not Found");
			}
				break;
			case 4: {// Display in sorted order
				Arrays.sort(arr);
				for (Employee e : arr) {
					System.out.println(e);
				}
			}
			}
		}

	}

}
