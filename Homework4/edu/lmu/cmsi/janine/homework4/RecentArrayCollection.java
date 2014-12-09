public class RecentArrayCollection<E> {
	private final int MAX_NUMBER = 10;
	private final Object[] array = new Object[MAX_NUMBER];
	
	public RecentArrayCollection() {
		throw new IllegalArgumentException("Argument must have one or two object(s)");
	}
	
	public RecentArrayCollection(Object o1) {
		this.array[0] = o1;
	}
	
	public RecentArrayCollection(Object o1, Object o2) {
		this.array[0] = o1;
		this.array[1] = o2;
	}
	
	public E getOldest() {
		if (this.array[0] == null) {
			throw new Exception("Array is empty");
		}
		return this.array[0];
	}
	
	public E getNewest() {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == null) {
				return this.array[i - 1];
			}
		}
		throw new Exception("Array is empty");
	}
	
	public boolean add(E e) {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == null) {
				this.array[i] = e;
				return true;
			}
		}
		return false;
	}
	
	/*public T getElement() {
		return (T) this.elements[14];
	}*/
	
	public int getSize() {
		if (this.array[0] == null) {
			return 0;
		}
		
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] == null) {
				return i + 1;
			}
		}
	}
	
	public void reset() {
		int[] newArray = new int[MAX_NUMBER];
		for (int i = 0; i < MAX_NUMBER; i++) {
			this.newArray[i] = null;
		}
		this.array = newArray;
	}
	
	/* public Iterator<E> iterator() {
	}	*/
	
	public static void main (String[] args) {
		String s1 = "hi";
		String s2 = "bye";
		RecentArrayCollection<String> arrayThing = new RecentArrayCollection<String>(s1, s2);
}