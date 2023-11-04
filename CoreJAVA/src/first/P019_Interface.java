package first;

interface inter1 {
	public void interface1();
	public static void interface4() {
		System.out.println("interface 1 static");
	}
}

interface inter2 extends inter1 {
	public void interface2();

	public static void interface5() {
		System.out.println("interface 2 static");
	}
}

interface inter3 {

	public static void interface6() {
		System.out.println("interface 3 static");
	}

	public void interface3();
}

class InterCall implements inter2, inter3 {

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

}

public interface P019_Interface {
	public static void main(String[] args) {
		InterCall i = new InterCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interface4();
		inter2.interface5();
		inter3.interface6();
	}
}
