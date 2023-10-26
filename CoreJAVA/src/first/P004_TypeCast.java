package first;
//implicit->compiler
//explicit->by user
import java.util.Scanner;

public class P004_TypeCast {
	public static void main(String[] args) {
		double d = 1.321654;
		System.out.println(d);
		int i = (int)d;
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		double c = (double)a / (double)b;
		System.out.println(c);
	}
}
