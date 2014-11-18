import java.util.*;
import homework5.*;

public class App {

	public static void main (String[] args) {
		//testing for FibonacciSequence
		System.out.println("" + FibonacciSequence.fibonacci(10)); //55
		System.out.println("" + FibonacciSequence.fibonacci(43)); //433494437
		
		//testing for StringToInt
		String x = "231";
		String y = "100";
		int x1 = StringToInt.stringToInt(x);
		int y1 = StringToInt.stringToInt(y);
		int xy = x1 + y1;
    	System.out.println(x1 + ""); //231
    	System.out.println(xy + ""); //331
    	
    	//testing for MultiplyTwo
    	System.out.println(MultiplyTwo.multiply(3, 2)); //6
    	System.out.println(MultiplyTwo.multiply(12, 12)); //144
    	
		//testing for ParenthesisChecker
		System.out.println("" + ParenthesisChecker.isBalance("([)]")); //false
		System.out.println("" + ParenthesisChecker.isBalance("([])")); //true
	}
	
}