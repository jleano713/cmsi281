package homework5;

public class FibonacciSequence {

	public static int fibonacci (int index) {
		if (index == 0|| index == 1) {
			return index;
		}
		return fibonacci(index - 1) + fibonacci(index - 2);
	}
	
}
		