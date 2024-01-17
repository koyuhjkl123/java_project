package com.keduit;

import java.util.LinkedList;
import java.util.Queue;

public class _06_QueueTest {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<String>();
//		q.remove(); // error 원소가 없어서 에러
//		q.remove();
//		원소가 없지만 없으면 null값을 반환
		System.out.println(q.poll());
		q.offer("사과");
		System.out.println("바나나를 추가했나요? " + q.offer("바나나"));

		System.out.println("Head : " + q.peek());

		try {
			q.add("체리");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

		System.out.println("heed" + q.peek());

		String head = null;
		try {
			head = q.remove();
			System.out.println(head + "제거됨.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("새로운 헤드 : " + q.element());
		head = q.poll();
		System.out.println(head + "제거됨");
		System.out.println("새로운 헤드 : " + q.peek());

		System.out.println("체리를 포함하고 있나요? -> " + q.contains("체리"));
		System.out.println("사과를 포함하고 있나요? -> " + q.contains("사과"));
		
		try {
			q.remove();
			System.out.println(q);
			q.remove();
		} catch (Exception e) {
			System.out.println("더 이상 원소가 없어요");
		}
		
	}

}
