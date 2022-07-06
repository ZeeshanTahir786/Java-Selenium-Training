package arrays;

public class Array_2D {

	public static void main(String[] args) {

		
		String [][] arr = {{"ABC","EFG","HIJ"},{"KLM","NOP"},{"QRS","TUV","WX","Y","Z"}};
		// how get the length of 2D Array
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
//		How to get the element
		
		System.out.println(arr[2][4]);
//		How to update the element in 2D Array
		
		System.out.println(arr[2][4]);
		arr[2][4] = "hafiz";
		System.out.println(arr[2][4]);
		
//		How to iterate over 2D array (loop)
		
		for(String[] x : arr) {
			for(String y : x) {
				System.out.println(y);
			}
		}
//		 second method
		
//		for (int i = 0; i<arr.length; i++){
//		     for (int j = 0; j<arr[i].length; j++){
//		    	 System.out.println(arr[i][j]);
//		     } 
//		}
		
//		===========================================
		
//		Write a program to add table to 2 to 6 in the rows of a 2-D array.
//		{
//			{2,4,6,8,9....20},
//			{3,6,9,12.....30},
//			{4,8,12,16....40},
//			{5,10,15,20...50},
//			{6,12,18,24...60}
//		}
		int [][] arr1 = new int [5][10];
		
		for (int i = 2; i <= 6 ; i++) {
			for (int j = 1; j <= 10; j++) {
				arr1[i-2][j-1]= i * j;
			}
		}
		for (int[] x : arr1) {
			for( int y : x) {
				System.out.print(y + " ");
			}
			System.out.println("\n");
		}
	}

}
