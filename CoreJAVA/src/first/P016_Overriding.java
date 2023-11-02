package first;
class Call1{
	public void callFun() {
		System.out.println("calll function parent");
	}
	public void call() {
		System.out.println("calll function parent");
	}
	
}
class Calling extends Call1{
	public void callFun() {
		super.callFun();
		System.out.println("calll function child");
	}
	public void call() {
		System.out.println("calll function parent");
	}
}
public class P016_Overriding {
	public static void main(String[] args) {
		Calling c = new Calling();
		c.callFun();
		c.callFun();
	}
}
