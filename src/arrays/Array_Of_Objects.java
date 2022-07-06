package arrays;

public class Array_Of_Objects {

	public static void main(String[] args) {

//		Array of objects for storing different data types values
		Object [][] arr = {
				{"Hello",false,23,"No"},
				{"Yes",false,23,"No"},
				{"Noo",false,23,"No"},
				{"Wao",false,23,"No"}
		};
		
		for(Object [] x :arr) {
			for(Object y : x) {
				System.out.print(y);
			}
		}
	}

}
