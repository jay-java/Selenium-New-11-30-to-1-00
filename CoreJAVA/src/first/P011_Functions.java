package first;

class ABC {
	public int add(int i, int j) {
		System.out.println("add function returning addition of numbers");
		return i + j;
	}

	public void call() {
		System.out.println("call function");
	}
	public double square(double num) {
		return num*num;
	}
}
public class P011_Functions {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.call();
		int res = a.add(12,340);
		System.out.println("result : "+res);
		double d =  a.square(23.2);
		System.out.println(d);
	}
}
