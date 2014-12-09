import java.util.LinkedList;

public class RecentLinkedListCollection<E> implements Iterable<E> {
	private final int MAX_NUMBER = 10;
	private int max_number = MAX_NUMBER;
	private final LinkedList linkedList = new LinkedList();
	
	public RecentLinkedListCollection() {
		this(max_number);
	}
	
	public RecentLinkedListCollection(int max_number) {
		if (max_number > 10) {
			return new IllegalArgumentException("Max number must be less than or equal to 10");
		}
		this.max_number = max_number;
		this(max_number);
	}
	
	public RecentLinkedListCollection(Object o1) {
		this.m
	}
	
	public E getOldest() {
		return this.linkedList.getFirst();
	}
	
	public E getRecent() {
		return this.linkedList.getLast();
	}
	
	public boolean add(E e) {
		if (this.linkedList.last) {
			return this.linkedList.add(e);
		}
	} 
	
	public int getSize() {
		return this.linkedList.size();
	}
	
	public void reset() {
		this.linkedList.clear();
	}
	
	public Iterator<E> iterator() {
		return new RecentCollection<E>(linkedList).iterator();
	}
}