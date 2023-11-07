package first;

final class Daata {
	final int i = 1;
	final public void change() {
//		i++;
		System.out.println(i);
	}
}
class Call2 extends Daata {
	public void change() {

	}
}

public class P020_FinalKeyword {
	public static void main(String[] args) {
		Daata d = new Daata();
		d.change();
	}
}
