package first;

import java.util.Scanner;

//4 Loops
/*1.for(initialization;condition;incre/decre){}
 * 2.while(condition){}
 * 3.do {} while(condition);
 * 4.for each
 * */
public class P006_Loops {
	public static void main(String[] args) {
		
		//1.for
		System.out.println("for loop");
		for(int i=0;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("while loop");
		int j=11;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		System.out.println();
		System.out.println("do while");
		int k=11;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to print table : ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+(i*num));
		}
		
		
	}
}
