package CollectionsClassNotes;
import 	java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {

	public void Setimplementation()
	{
		//Set<Integer> name =new HashSet<>();
		//Set<Integer> name =new LinkedHashSet<>();
		Set<Object> name =new TreeSet<>();
		List<Integer> age = new LinkedList<>();

		System.out.println(name);

		// add
		name.add(1);
		name.add(10);
		name.add(8);
		name.add(20);
		name.add(1);
		name.add(2);
		name.add("sathish");
		//name.add(null);
		age.add(57);
		age.add(100);

		System.out.println(name);
		name.addAll(age);
		System.out.println(name);

		//update

		// delete
		//name.remove(100);
		name.removeAll(age);
		System.out.println(name);

		// retrieve

		for(Object value: name)
		{
			System.out.println(value);
		}

		Iterator it = name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		name.size();
		name.isEmpty();
		//name.clear();
		name.contains(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetConcepts s = new SetConcepts();
		s.Setimplementation();
	}

}
