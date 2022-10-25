package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("가");
		q.offer("나");
		q.offer("다");
		
		System.out.println("Stack 결과");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println("\n");
		System.out.println("Queue 결과");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	
	}

}
