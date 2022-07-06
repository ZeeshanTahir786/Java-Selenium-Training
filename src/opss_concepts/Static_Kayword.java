package opss_concepts;

public class Static_Kayword {
	/* Static Keyword 
	 * Static Members Belong to Class (Type) and not to Object */
	
	static String Employee_Name = "Ali";
	int Employee_ID = 001;
	int Employee_Salary = 1000;
	
	public void displayEmployeeBonus() {
		System.out.println("Employee "+ Employee_Name + " gets the bonus of " + (Math.round(Employee_Salary * 0.20)));
	}
}
