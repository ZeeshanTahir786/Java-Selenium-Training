package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] DaysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; 
		System.out.println(DaysOfWeek.length);
		
		for (int i = 0; i < DaysOfWeek.length ; i++) {
			System.out.println(DaysOfWeek[i]);
		}
		
		int [] arr = new int [10];
		
		arr[6] = 88;
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

		for(String x : DaysOfWeek) {
			System.out.println(x);
		}
	}

}
