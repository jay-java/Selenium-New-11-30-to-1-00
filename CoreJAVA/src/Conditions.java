import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		// 1.simple if
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// 2.if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// nested if
		System.out.println("enter age = ");
		int age = sc.nextInt();
		if (age > 18) {
			boolean haveTicket = false;
			if (haveTicket) {

				System.out.println("permission granted");
			} else {
				System.out.println("first buy ticket");
			}
		} else {
			System.out.println("below 18");
		}

		// else if ladder
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("C grade");
		} else if (m >= 61 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("enter your choice : 1. Area of Traingle\n2\n3\n4");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("first");
			break;
		case 2:
			System.out.println("second");
			break;
		case 3:
			System.out.println("third");
			break;
		case 4:
			System.out.println("fourth");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
