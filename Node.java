package linked_list;

public class Node {
	public static int c = 0;
	private int id;
	private String data;
	private Node next;
	
	public Node(String data) {
		c++;
		this.id = c;
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getCount() {
		return id;
	}
}
