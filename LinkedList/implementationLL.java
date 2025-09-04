package LinkedList;

class SLL /* Singly LinkedList */ {
	Node head; // indicates the first position of the LinkedList
	Node tail; // indicates the last position of the LinkedList
	int size; // indicates the size of the LinkedList

	void InsertAtTail(int val) {
		Node temp = new Node(val); // stores the value that is to be inserted to the temporary node
		if (head == null)
			head = tail = temp;
		else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	
	void InsertAtHead(int val) {
		Node temp = new Node(val);
		if (head == null)head = tail = temp;
		else {
			temp.next = head;
			head = temp;
		}
		size++;
	}

	void Insert(int idx, int val) {
		if (idx == 0) {
			InsertAtHead(val);
			return;
		}

		if (idx == size) {
			InsertAtTail(val);
			return;
		}
		if (idx > size || idx < 0) {
			System.out.println("Invalid Index!!");
			return;
		}
		Node temp = new Node(val);
		Node x = head;
		for (int i = 1; i <= idx - 1; i++) {
			x = x.next; // by this, the x node gets it correct position
		}
		temp.next = x.next;
		x.next = temp;
		size++;
	}

	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	void size() {
		System.out.println("Length of LinkedList: " + size);
	}

	int get(int idx) throws Error {
		if (idx == size - 1)
			return tail.val;
		if (idx > size || idx < 0) {
			throw new Error("Bhai Index to sahi Dal!!!(Error)");
		}
		Node temp = head;
		for (int i = 1; i < idx; i++) {
			temp = temp.next;
		}
		return temp.val;
	}

	void set(int idx, int val) throws Error {
		if (idx == size - 1) {
			tail.val = val;
		}

		if (idx > size || idx < 0) {
			throw new Error("Bhai Index to sahi Dal!!!(Error)");
		}
		Node temp = head;
		for (int i = 1; i < idx; i++) {
			temp = temp.next;
		}
		temp.val = val;
	}

	void deleteAtHead() throws Error {
		if (head == null)
			throw new Error("List is Empty");
		head = head.next;
		size--;
	}

	void delete(int idx) throws Error {
		if (idx == 0) {
			deleteAtHead();
			return;
		}
		if (idx < 0 || idx > size)
			throw new Error("Invalid Index!");
		Node temp = head;
		for (int i = 1; i <= idx - 1; i++) {
			temp = temp.next;
		}
		if (temp.next == tail)
			tail = temp;
		temp.next = temp.next.next;
		size--;

	}
}

public class implementationLL {

	public static void main(String[] args) {
		SLL list = new SLL();
		list.InsertAtTail(10);
		list.InsertAtTail(20);
		list.InsertAtTail(30);
		list.InsertAtTail(40);
		list.InsertAtTail(50);
		list.display();
		list.InsertAtTail(34);
		list.InsertAtHead(87);
		list.display();
		list.Insert(4, 12);
		list.display();
//		list.Insert(10, 440);
		list.set(2, 87);
		list.display();
//		list.deleteAtHead();
//		list.deleteAtHead();
		list.display();
		list.delete(5);
		list.display();
		list.size();
		list.delete(1);
		list.display();
		list.delete(2);
		list.display();
	}

}
