import edu.lmu.cmsi.janine.homework4.itcollection.IterableCollection;
import java.util.Iterator;

public class App {
	public static void main (String[] args) {
		String name = "Janine Leano";
		String address = "10611 Vassar Ave";
		IterableCollection<String> stringsOnly = new IterableCollection<String>(name, address);
		
		System.out.println("Old way");
		Iterator<String> iter = stringsOnly.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		System.out.println("New way");
		for(String s: stringsOnly) {
			System.out.println(s);
		}
	}
}