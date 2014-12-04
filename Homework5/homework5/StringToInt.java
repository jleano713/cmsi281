package homework5;

public class StringToInt {

	public static int x = 0;
	public static int index = 0;
	
	public static int stringToInt(String s) {
		if (s.charAt(0) == '-') {
			throw new IllegalArgumentException("Non-negative numbers only");
		}
		int integer = Integer.parseInt(s.charAt(index) + "");
		x += integer * Math.pow(10, s.length() - index - 1);
		if (index == s.length() - 1) {
			int y = x;
			x *= 0;
			index *= 0;
			return y;
		}		
		index++;
		return stringToInt(s);
	}

}