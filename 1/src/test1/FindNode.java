package test1;

import test1.TestBoo.Node;

public class FindNode {
	private Node head;

	private static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

	}

	static Node findNthNodeFromLast(Node head, int n) {
		Node firstPtr = head;
		Node secondPtr = head;
		for (int i = 0; i < n; i++) {
			firstPtr = firstPtr.next;
		}
		while (firstPtr != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}
		return secondPtr;
	}

	public void addToTheLast(Node n) {
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = n;
		}

	}
}
