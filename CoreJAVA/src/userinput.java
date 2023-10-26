import java.util.Scanner;

class SeleniumJavaLearning{
	public void call() {
		System.out.println("call function calling");
	}
	public void run() {
		System.out.println("run function calling");
	}
}
public class userinput {
	public static void main(String[] args) {
		System.out.println("main method");
		SeleniumJavaLearning obj = new SeleniumJavaLearning();
		obj.call();
		obj.run();
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter j = ");
		j = sc.nextInt();
		System.out.println(i+j);
		float f;
		System.out.println("enter float = ");
		f = sc.nextFloat();
		
	}
}
