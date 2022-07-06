package arrays;

import java.util.Scanner;

public class Array_Exercise {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Please enter value : ");
		int num1 = sc.nextInt();
		
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = num1 * i;
		}

		for(int x : arr) {
			System.out.println(x);
		}
		
//		================================================
		
//		* Write a program to reverse the contents of an array
		System.out.println("======================================");
		int [] arr1 = {10,20,30,40,50,60,70,80};
		int j =  arr1.length - 1;
		
		int temp =0;

		for (int i = 0; i <= (arr1.length - 1) / 2; i++) {
			temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
			
			j--;
		}
		for(int x : arr1) {
			System.out.println(x);
		}
		
	}

}
