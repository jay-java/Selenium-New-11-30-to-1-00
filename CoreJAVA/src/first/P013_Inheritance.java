package first;

class P {//Parent
	public void fun() {
		System.out.println("fun in P class");
	}
	public void add() {
		System.out.println("fun in P class");
	}
}

class C extends P{ //child

	public void call() {
		System.out.println("call in C class");
	}
}
class A1{
	
}
class GC extends C{
	public void data() {
		System.out.println("data in GC class");
	}
}

public class P013_Inheritance {
	public static void main(String[] args) {
		P p = new P();
		p.add();
		p.fun();
		C c = new C();
		c.add();
		c.call();
		c.fun();
		GC g=  new GC();
		g.add();
		g.fun();
		g.call();
		g.data();
	}
}
