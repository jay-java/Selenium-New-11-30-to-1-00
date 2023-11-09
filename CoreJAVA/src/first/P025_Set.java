package first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P025_Set {
	public static void main(String[] args) {
		Set list = new HashSet();
		list.add(1);
		list.add('a');
		list.add("java");
		list.add(345.4);
		list.add(false);
		list.add(346456645);
		list.add(1);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
