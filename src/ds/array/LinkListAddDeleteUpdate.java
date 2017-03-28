package ds.array;

class Node {
	int data;
	Node next;
}

public class LinkListAddDeleteUpdate {

	void Print(Node head) {
		if (head != null) {
			System.out.println(head.data);
			Print(head.next);
		}
	}

	Node Insert(Node head, int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if (head == null) {
			head = temp;
			return head;
		} else {// To insert node at front temp.next=head; return temp;
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
			return head;
		}

	}

	Node InsertNth(Node head, int data, int position) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if (head == null) {
			// head = temp;
			return temp;
		} else {// To insert node at front
			if (position == 0) {
				temp.next = head;
				return temp;

			} else {
				Node current = head;
				for (int i = 0; i < position - 1; i++) {
					current = current.next;
				}
				temp.next = current.next;
				current.next = temp;
				return head;
			}
		}
	}

	Node Delete(Node head, int position) {
		if (head == null)
			return head;
		else {
			if (position == 0) {
				return head.next;
			} else {
				Node current = head;
				for (int i = 0; i < position - 1; i++) {
					current = current.next;
				}

				current.next = current.next.next;
				return head;
			}
		}
	}
	/*
	 * Node Delete(Node head, int position) { if (position == 0){ return
	 * head.next; } head.next = Delete(head.next, position-1); return head; }
	 */

	int CompareLists(Node headA, Node headB) {

		if (headA == null && headB == null) {
			return 1;
		} else if (headA == null || headB == null) {
			return 0;
		}

		if (headA.data == headB.data) {
			return (CompareLists(headA.next, headB.next));
		}

		return 0;
	}

	Node Reverse(Node head) {

		if (null == head || null == head.next) {
			return head;
		}

		Node n = Reverse(head.next);
		head.next.next = head;
		head.next = null;
		return n;
	}

	void ReversePrint(Node head) {
		if (head != null) {
			ReversePrint(head.next);
			System.out.println(head.data);
		}
	}

	Node MergeLists(Node headA, Node headB) {

		if (headA == null)
			return headB;

		if (headB != null) {
			if (headA.data < headB.data) {
				headA.next = MergeLists(headA.next, headB);
				return headA;
			}
			headB.next = MergeLists(headA, headB.next);
			return headB;
		}

		return headA;
	}
}
