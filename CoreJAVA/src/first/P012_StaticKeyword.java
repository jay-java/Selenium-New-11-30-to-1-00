package first;
class User{
	static{
		System.out.println("static user class");
	}
	int id;
	String name;
	static String cname ="TOPS";
	User(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void showData() {
		System.out.println("id : "+id+" name : "+name+" cname : "+cname);
	}
	public static void call() {
		System.out.println("static in user class");
	}
	
}
public class P012_StaticKeyword {
	static{
		System.out.println("static main class");
	}
	public static void main(String[] args) {
		User u1 = new User(1, "java");
		u1.showData();
		User u2 = new User(2, "python");
		u2.showData();
		User u3 = new User(3, "kotlin");
		User u4 = new User(4, "dart");
		User.call();
	}
}
