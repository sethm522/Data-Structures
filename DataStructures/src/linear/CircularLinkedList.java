package linear;

public class CircularLinkedList<T> {
	Node<T> back;
	int size;
	public CircularLinkedList() {
		back = null;
		size = 0;
	}
	
	public void addToBack(T item) {
		Node<T> node = new Node<T>(item, null);
		if (back == null) {
			back = node;
			node.next = back;
		} else {
			node.next = back.next;
			back.next = node;
			back =  node;
		}
	}
	
	public void addToFront(T item) {
		Node<T> node = new Node<T>(item, null);
		if (back == null) {
			back = node;
			node.next = back;
		} else if (back.next == back) {
			back.next = node;
			node.next = back;
		} else {
			node.next = back.next;
			back.next = node;
		}

	}
	
	
	
	public void traverse() {
		if (back == null) {
			System.out.println("Empty List");
		} else if (back.next == back) {
			System.out.println(back);
		} else {
			Node<T> trav = back.next;
			while (trav != back) {
				System.out.print(trav.data + " -> ");
				trav = trav.next;
			}
			System.out.println(back);
		}
	}
}
