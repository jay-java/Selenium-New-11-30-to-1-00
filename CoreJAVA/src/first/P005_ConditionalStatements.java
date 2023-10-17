package first;

import java.util.Scanner;

//1.simple if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case
public class P005_ConditionalStatements {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter j = ");
		j = sc.nextInt();
		// 1.simple if
		if (i > j) {
			System.out.println("i is greater than j");
		}

		// if else
		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("i is less than j");
		}

		// nested if
		System.out.println("enter age  = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("You are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}

		} else {
			System.out.println("age is less than 18");
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
		} else if (m >= 81 && m <= 100) {
			System.out.println("A grade");
		} else {
			System.out.println("invalid input");
		}

		// switch case
		System.out.println("1.English\n2.Hindi\n3.Gujarati");
		System.out.println("enter you choice : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected hindi");
			break;
		case 3:
			System.out.println("You selected Gujarati");
			break;
		default:
			System.out.println("invalid input");
		}

	}
}
