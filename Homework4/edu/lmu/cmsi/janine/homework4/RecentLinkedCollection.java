public class RecentLinkedCollection<E> implements Iterable<E> {
	private final int MAX_NUMBER = 10;
	private int max_number = MAX_NUMBER;
	private Node<E> element1 = new Node<E>();
	private Node<E> element2 = new Node<E>();
	
	public RecentLinkedCollection() {
		this(MAX_NUMBER);
	}
	
	public RecentLinkedCollection(int max_number) {
		this.max_number = max_number;
		this(max_number);		
	}
	
	public E getOldest() {
	}
	
	public E getNewest() {
	}
	
	public boolean add(E e) {
	}
	
	public int getSize() {
	}
	
	public void reset() {
	}
	
	public Iterator<E> iterator() {
	}
}