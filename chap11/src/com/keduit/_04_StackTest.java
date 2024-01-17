package com.keduit;

import java.util.Stack;

public class _04_StackTest {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<String>();
		
		s1.push("사과");
		s1.push("배");
		s1.push("귤");
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.isEmpty());
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		s2.add(10);
		s2.add(20);
		s2.add(1, 100);


		for(int v: s2) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		while (!s2.empty()) {
			System.out.print(s2.pop() + " ");
		}
	}

}
