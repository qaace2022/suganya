package Collection;

import java.util.LinkedList;

public class Linked_List{
	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	Student s=new Student();
	Employee e=new Employee();
	Actor a=new Actor();
	Mobile m=new Mobile();
	Bike b=new Bike();
	ll.add("Suganya");
	ll.add(null);
	ll.add(e);
	ll.remove(e);
	ll.add(b);
	ll.add(a);
	ll.add(m);
	ll.add(null);
	ll.add(501);
	ll.add(s);
	ll.add(m);
	for(Object o:ll) {
		System.out.println(o);
	}

}
}
