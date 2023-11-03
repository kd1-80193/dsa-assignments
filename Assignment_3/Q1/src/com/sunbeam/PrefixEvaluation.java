package com.sunbeam;

public class PrefixEvaluation {
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

	public static int prefixEvalution(String postfix) {
		Stack stack = new Stack(10);

		String[] s = postfix.split("\\s+");

		for (int i = s.length - 1; i >= 0; i--) {
			String str = s[i];
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
		String prefix = "+ + 22 23 24";

		int res = prefixEvalution(prefix);
		System.out.println("Prefix Evaluation = " + res);
	}

}
