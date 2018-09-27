import java.util.*;
class LinkedListStack {
	private Node head;
	private class Node {
		char value;
		Node next;
	}

	public LinkedListStack() {
		head = null;
	}
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}

	public char pop() {
		if (head == null) {
		}
		char value = head.value;
		head = head.next;
		return value;
	}
	public void push(char value) {
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next = oldHead;
	}
}
public class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int j = 0;
		int num = Integer.parseInt(s1);
		while(j < num) {
		boolean x = balanced(num,s);
		if(x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		j++;
	}

		}
		public static boolean balanced(int range, Scanner s) {
			boolean y = false;
			LinkedListStack stack = new LinkedListStack();
				String s2 = s.nextLine();
				for(int i = 0; i < s2.length(); i++) {
					char ch = s2.charAt(i);
					if(ch == '(' || ch == '[' || ch == '{') {
						stack.push(ch);
					}
					else if(ch == ')') {
						if(stack == null || stack.pop() != '(') {
							y = false;
							return y;
						}
					}
					else if(ch == ']') {
						if(stack == null || stack.pop() != '[') {
							y = false;
							return y;
						}
					}
					else if(ch == '}') {
						if(stack == null || stack.pop() != '{') {
							y = false;
							return y;
						}
					}
				}
			if(stack.isEmpty()) {
				y = true;
				return y;
			} else {
			return y;
		}
		}
	}