package opss_concepts;

public class Constructor {

	public static void main(String[] args) {
		/* Concept of Constructor
		* A block of code similar to method that gets executed when instance of a class is created 
		* Generally used to initialize member variables of a class 
		* Constructor name is same as that of class name 
		* Constructor does not have return type (It does not return any value)
		* Constructor overloading */
		
		Road_Toll rt = new Road_Toll();
		rt.tiresCount = 4;
		rt.type = "ssuz";
		
		rt.calculateTall();
		
		Road_Toll rt1 = new Road_Toll("suzz",5);
		rt1.calculateTall();

	}

}
