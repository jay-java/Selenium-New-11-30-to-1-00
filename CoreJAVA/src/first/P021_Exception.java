package first;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide {// B
	Scanner sc = new Scanner(System.in);
	public void division() throws ArithmeticException,InputMismatchException {
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i / j;
		System.out.println(k);
	}
	public void input() {
		System.out.println("enter contact");
		int contact = sc.nextInt();
		if(contact<0) {
			throw new InputMismatchException("");
		}
		else {
			System.out.println(contact);
		}
	}
}

public class P021_Exception { // A
	public static void main(String[] args) {
		Divide d = new Divide();
		try {
			d.division();
			d.input();
		} catch (ArithmeticException e) {
			System.out.println("denominator should be greater than 0");
		}
		catch(InputMismatchException e) {
			System.out.println("denominator should be numeric");
		}

//		try {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("enter i = ");
//			int i = sc.nextInt();
//			System.out.println("enter j = ");
//			int j = sc.nextInt();
//			int k = i/j;
//			System.out.println(k);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric");
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everytime");
//		}
	}
}
