package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P023_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add('a');
		list.add("java");
		list.add(345.4);
		list.add(false);
		list.add(346456645);
		list.add(1);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.add(346);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
