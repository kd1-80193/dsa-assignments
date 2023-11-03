
public class StackMain {

	public static void main(String[] args) {

		// using inner stack class
//		StackUsingLinkedList st = new StackUsingLinkedList();
//		st.push(10);
//		st.push(20);
//
//		st.display();
//		st.pop();
//		st.peek();
//		System.out.println("-----after popping------");
//		st.display();

		// using stack class
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.pop();
		s.peek();
	}

}
