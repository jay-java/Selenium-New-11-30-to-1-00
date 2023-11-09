package first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P026_Map {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "c");//entry
		map.put(2, "c++");
		map.put(3, "java");
		map.put(4, "dart");
		map.put(null, "kotlin");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
		}
	}
}
