public class Node<E> {
	private E value = null;
	private Node<E> next = null;
	
	public Node(E value) {
		this.value = value;
	}
	
	public E getValue() {
		return this.value;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	private static void printLinkedList(Node<String> head) {
        Node<String> current = head;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}