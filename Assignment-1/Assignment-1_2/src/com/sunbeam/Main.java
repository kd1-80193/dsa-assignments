package com.sunbeam;

import java.util.Scanner;

public class Main {
	public static int linearSearch(Employee e[], int id) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].getEmpid() == id) {
				return i;
			}
		}
		return -1;
	}
		public static int linearSearchByName(Employee e[], String name) {
			for (int i = 0; i < e.length; i++) {
				if (e[i].getName().equals(name)) {
					return i;
				}
			}
			return -1;
		}
	
			public static int linearSearchBySalary(Employee e[], double salary) {
				for (int i = 0; i < e.length; i++) {
					if (e[i].getSalary() == salary) {
						return i;
					}
				}
				return -1;
			}
		
			

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[3];
		e[0] = new Employee(1, "Dau", 900.0);
		e[1] = new Employee(2, "Golu", 1900.0);
		e[2] = new Employee(3, "rahul", 1200.0);
		System.out.print("Enter id for searching: ");
		int id = sc.nextInt();
		int i = linearSearch(e, id);
		System.out.println("Found at index: " + i);
		
		System.out.print("Enter name for searching: ");
		String name = sc.next();
		int n = linearSearchByName(e, name);
		System.out.println("Found at index: " + n);
		
		System.out.print("Enter salary for searching: ");
		double salary = sc.nextDouble();
		int s = linearSearchBySalary(e, salary);
		System.out.println("Found at index: " + s);

	}

}
