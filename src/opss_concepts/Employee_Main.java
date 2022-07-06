package opss_concepts;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();

		emp1.Employee_ID = 786;
		emp1.Employee_Name = "Hafiz Zeeshan";
		emp1.Employee_Salary = 98999;
		
		emp1.displayEmployeeBonus();
		
		emp2.Employee_ID = 787;
		emp2.Employee_Name = "Hassan";
		emp2.Employee_Salary = 10000;
		
		emp2.displayEmployeeBonus();
	}

}
