package Collection;

import java.util.HashMap;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("Password", "siriuS123");
		hm.put("Password", "siriuS12345");
		hm.put("Username", "siriuS");
		hm.put("InstaUsername","siriuS");
		hm.put("Location", "Chennai");
		hm.put("year", 2022);
		hm.put(90.88, "Percentage");
		hm.put("poor", null);
		hm.put("case", null);
		hm.put(null, "value");
		hm.put(null, "person");
		Set s=hm.entrySet();
		for(Object o:s)
		{
			System.out.println(o);
		}

	}

}
