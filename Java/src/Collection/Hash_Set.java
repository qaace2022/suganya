package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Bike b=new Bike();
		hs.add(e);
		hs.add("Chennai");
		hs.add(s);
		hs.add(null);
		hs.add(a);
		hs.add(1245);
		hs.add(m);
		hs.add(a);
		hs.add(b);
		hs.add(null);
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
