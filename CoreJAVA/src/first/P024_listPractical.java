package first;

import java.util.ArrayList;
import java.util.List;

class Friends{
	int id;
	String name;
	String address;
	public Friends(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
public class P024_listPractical {
	public static void main(String[] args) {
		Friends f1 = new Friends(1, "ankit", "abc");
		Friends f2 = new Friends(2, "shivam", "abc");
		Friends f3 = new Friends(3, "aakib", "abc");
		Friends f4 = new Friends(4, "shaili", "abc");
		Friends f5 = new Friends(5, "nilam", "abc");
		List<Friends> list =  new ArrayList<Friends>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		System.out.println(list);
		for(Friends f:list) {
			System.out.println(f);
		}
	}
}
