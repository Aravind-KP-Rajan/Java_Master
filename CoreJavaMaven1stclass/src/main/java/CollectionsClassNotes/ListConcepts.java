package CollectionsClassNotes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListConcepts {

	String[] name = {};

	public void ArrayListimplementation()
	{
		/*List<String> ls= new ArrayList<>();
		List<String> ls1= new ArrayList<>();
		List<String> ls2= new ArrayList<>();*/

		List<Object> ls= new LinkedList<>();
		List<String> ls1= new LinkedList<>();
		List<String> ls2= new LinkedList<>();

		System.out.println(ls);

		// Add a value
		ls.addLast("Last");
		ls.add("sathish");
		ls.add("Btech");
		ls.add("sathish");
		ls.add("kumar");
		ls1.add("Besant");
		ls1.add("Technology");
		ls.addAll(ls1);
		ls.addFirst("First");
		ls.add(4, "Wednesday");
		ls.add(7);



		System.out.println(ls);
		System.out.println(ls1);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());

		//update
		ls.set(3, "Information technology");
		System.out.println(ls);

		// delete
		ls.remove(3);
		System.out.println(ls);
		ls.removeFirst();
		System.out.println(ls);
		ls.removeLast();

		// clear
		//ls.clear();
		//System.out.println(ls);

		// retrieve
		System.out.println(ls.get(1));

		// get all the values
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}

		for(Object eachValue: ls)
		{
			System.out.println(eachValue);
		}

		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());

		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println(ls.contains("sathish"));


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcepts l = new ListConcepts();
		l.ArrayListimplementation();
	}

}
