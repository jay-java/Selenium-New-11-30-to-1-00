package first;

import java.util.Scanner;

public class P007_Array {
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5};
		for(int index=0;index<i.length;index++) {
			System.out.println(i[index]);
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter element at arr["+index+"] : ");
			arr[index] = sc.nextInt();
		}
		int sum =0;
		for(int index=0;index<arr.length;index++) {
			sum = sum + arr[index];
		}
		System.out.println("sum = "+sum);
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter =0;
		for(int index=0;index<arr.length;index++) {
			if(num == arr[index]) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes exist "+counter+" times");
		}
		else {
			System.out.println("not exist");
		}
	}
	
}
