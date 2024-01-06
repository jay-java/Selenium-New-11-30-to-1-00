package basic;
class A{
	public void call() {
		System.out.println("A class");
	}
}
class B extends A{
	public void call() {
		super.call();
		System.out.println("B class");
	}
}
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		B b = new B();
		b.call();
	}
}
