package com.sunbeam;

import java.util.Scanner;

public class DescStack {
	private int top;
	private int arr[];
	private final int SIZE;

	public DescStack(int size) {
		super();
		SIZE = size;
		arr = new int[SIZE];
		top = size;
	}

	public void push(int data) {

		top--;
		arr[top] = data;
	}

	public int pop() {
		int data = arr[top];
		return data;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == SIZE;
	}

	public boolean isFull() {
		return top == -1;
	}

	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		DescStack st = new DescStack(4);
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (st.isFull()) {
					System.out.println("Stack is full");
				} else {
					System.out.println("Enter data: ");
					int data = sc.nextInt();
					st.push(data);
				}
				break;
			case 2:
				if (st.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Poped out data: " + st.pop());
				}
				break;
			case 3:
				if (st.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Peeked data: " + st.peek());
				}
				break;
			}

		}
	}
}
