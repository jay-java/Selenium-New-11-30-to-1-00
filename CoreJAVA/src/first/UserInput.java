package first;

import java.util.Scanner;

class Call{
	public void run() {
		System.out.println("run method calling by call class");
	}
}
public class UserInput {
	public static void main(String[] args) {
		int i = 12, j = 13,a,b;
		Call obj = new Call();
		obj.run();
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		a = sc.nextInt();
		System.out.println("a = "+a);
		System.out.println("enter b = ");
		b = sc.nextInt();
		System.out.println("b = "+b);
	}
}
