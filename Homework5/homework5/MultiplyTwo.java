package homework5;

public class MultiplyTwo {
    
	public static int multiply (int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		return x + multiply(x, y - 1);
	}

}