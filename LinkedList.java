package linked_list;

public class LinkedList {
	private Node head;
	private Node tail;
	public void insertAtEnd(String data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}
		else {
			tail.setNext(newnode);
			tail = newnode;
			tail.setNext(null);
		}
	}
	public void insertAtBegin(String data) {
		Node newnode = new Node(data);
		if(head==null) {
			head = newnode;
			tail = newnode;
		}
		else {
			newnode.setNext(head);
			head = newnode;
		}
	}
	public void insertAtPos(String data,int n) {
		Node newnode = new Node(data);
		Node temp = head;
		int x = 0;
		while(x<n-1) {
//			x = temp.getCount();
			temp = temp.getNext();
			x++;
		}
//		System.out.println(x);
		newnode.setNext(temp.getNext());
		temp.setNext(newnode);
	}
	public void displayList() {
		Node temp;
		temp = head;
		while(temp!=null){
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
