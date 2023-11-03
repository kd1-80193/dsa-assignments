package com.sunbeam;

public class MiddleMain {

	public static void main(String[] args) {
		FindMiddleNode f = new FindMiddleNode();
		f.addFirst(60);
		f.addFirst(50);
		f.addFirst(40);
		f.addFirst(30);
		f.addFirst(20);
		f.addFirst(10);
		f.addLast(70);
		
		f.middleNode();
		f.display();
	}

}
