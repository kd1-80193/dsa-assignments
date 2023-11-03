package com.sunbeam;

import java.util.Arrays;

public class Postfix {
	public static int calculate(int op1, String ele, int op2) {

		switch (ele) {
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "%":
			return op1 % op2;
		}
		return 0;
	}
//using String Builder
//	public static int postfixEvalution(String postfix) {
//		Stack stack = new Stack(10);
//		// StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < postfix.length(); i++) {
//			char ele = postfix.charAt(i);
//			if (Character.isDigit(ele)) {
//				stack.push(Character.getNumericValue(ele));
//			} else {
//				int op2 = stack.pop();
//				int op1 = stack.pop();
//				int res = calculate(op1, ele, op2);
//				stack.push(res);
//			}
//		}
//		if (!stack.isEmpty())
//			return stack.pop();
//		return 0;
//	}

	public static int postfixEvalution(String postfix) {
		Stack stack = new Stack(10);

		String[] s = postfix.split("\\s+");

		for (String str : s) {
			if (str.matches("\\d+")) {
				stack.push(Integer.parseInt(str));
			} else {
				int op2 = stack.pop();
				int op1 = stack.pop();
				int res = calculate(op1, str, op2);
				stack.push(res);
			}
		}
		if (!stack.isEmpty())
			return stack.pop();
		return 0;

	}

	public static void main(String[] args) {
		String postfix = "21 23 + 24 +";

		int res = postfixEvalution(postfix);
		System.out.println("Postfix evalution = " + res);

	}
}
