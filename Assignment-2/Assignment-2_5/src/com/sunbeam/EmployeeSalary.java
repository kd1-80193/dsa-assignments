package com.sunbeam;

import java.util.Arrays;

public class EmployeeSalary {

	public static void salarySort(int sal[], int size) {
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (sal[i] > sal[j]) {
					int temp = sal[i];
					sal[i] = sal[j];
					sal[j] = temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int sal[] = { 400, 230, 550, 109, 350, 700, 467, 203, 900 };
       int size = sal.length;
       System.out.println("Salaries before sort: "+Arrays.toString(sal));
       salarySort(sal,size);
       System.out.println("Salaries after sort: "+Arrays.toString(sal));
	}

}
