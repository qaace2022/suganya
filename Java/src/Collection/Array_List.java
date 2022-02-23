package Collection;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Bike b=new Bike();
		al.add('z');
		al.add(null);
		al.add(e);
		al.add("Sirius");
		al.add(null);
		al.add(a);
		al.add(123);
		al.add(s);
		al.add(m);
		al.add(b);
		for(Object o:al)
		{
			System.out.println(o);
		}

	}

}
