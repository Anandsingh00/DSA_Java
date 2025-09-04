package LinkedList;

class dNode {
	int val;
	dNode next;
	dNode prev;

	dNode(int val) {
		this.val = val;
	}
}

class DLL {
	dNode head;
	dNode tail;
	int size;

	void display() {
		dNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	void insertAtTail(int val) {
		dNode temp = new dNode(val); // created a new node
		if (size == 0)
			head = tail = temp;
		else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
		size++;
	}

	void insertAtHead(int val) {
		dNode temp = new dNode(val);
		if (size == 0)
			head = tail = temp;
		else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		size++;
	}

	void Insert(int idx, int val) {
		if (idx == 0) {
			insertAtHead(val);
			return;
		}

		if (idx == size) {
			insertAtTail(val);
			return;
		}
		if (idx > size || idx < 0) {
			System.out.println("Invalid Index!!");
			return;
		}
		dNode temp = new dNode(val);
		dNode x = head;
		for (int i = 1; i <= idx - 1; i++) {
			x = x.next; // by this, the x node gets it correct position
		}
		dNode y = x.next;
		x.next = temp;
		temp.prev = x;
		y.prev = temp;
		temp.next = y;
		size++;
	}

	void deleteAtHead() throws Error {
		if (size == 0)
			throw new Error("List is Empty");
		head = head.next;
		head.prev = null;
		size--;
	}

	void deleteAtTail() throws Error {
		if (size == 0)
			throw new Error("List is Empty");
		tail = tail.prev;
		tail.next = null;
		size--;
	}

	void delete(int idx) throws Error {
		if (idx == 0) {
			deleteAtHead();
			return;
		}
		if (idx == size) {
			deleteAtTail();
			return;
		}
		if (idx < 0 || idx > size)
			throw new Error("Invalid Index!");

		dNode temp = head;
		for (int i = 1; i <= idx - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;
		temp = temp.next;
		temp.prev = temp.prev.prev;
		size--;

	}

	void set(int idx, int val) throws Error {
		if (idx < 0 || idx == size)
			throw new Error("List is Empty");
		dNode temp = new dNode(val); // created a new node for setting the value

		if (idx == 0) {
			temp.next = head.next;
			if (head.next != null) { // Handle case if there's more than 1 element
				head.next.prev = temp;
			}
			head = temp;
			return; // Stop further execution
		}
		if (idx == size - 1) {
			tail = tail.prev;
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
			return;
		}

		dNode x = head;
		for (int i = 1; i < idx; i++) {
			x = x.next;
		}
		dNode y = x.next.next;
		x.next = temp;
		temp.prev = x;
		y.prev = temp;
		temp.next = y;
		return;
	}

}

public class doublyLinkedListImplementation {
	public static void print(dNode head) {
		dNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void printRev(dNode tail) {
		dNode temp = tail;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.prev;
		}
		System.out.println();

	}

	public static void display(dNode node) {
		dNode temp = node;
		while (temp.prev != null) {
			temp = temp.prev;
		}
		// now temp is at head
		print(temp);

	}

	public static void main(String[] args) {
		DLL list = new DLL();

		list.Insert(0, 10);
		list.Insert(1, 20);
		list.Insert(2, 30);
		list.Insert(3, 40);
		list.Insert(4, 50);
		list.display();
		list.set(3, 70);
		list.display();

	}

}
