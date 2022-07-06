package opss_concepts;

public class temp extends Final_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars c1 = new Cars();
		c1.color = "Red";
		
		c1.displayDetails();
		

		Cars c2 = new Cars();
		c2.color = "Black";
		
		c2.make = "Toyota";
		c2.displayDetails();
		
		
		Encapsolation encp = new Encapsolation();
		
		encp.setStudentCount(50);
		encp.setSubject("Mathematics");
		encp.displayDetails();
		
		
		Static_Kayword sk = new Static_Kayword();
		
		Static_Kayword.Employee_Name = "Hello";
		sk.Employee_ID=101;
		sk.Employee_Salary=1999;
		sk.displayEmployeeBonus();
		
		
		Bank_Account_Example b1 = new Bank_Account_Example(0011002345,"Hafiz Zeeshan",25000);
		b1.displayBalence();
		b1.deposit(2500);
		b1.displayBalence();
		b1.withdraw(2500);
		b1.displayBalence();

		
//		final void abc() {
//			System.out.println("dsc");
//		}
		
		
		
	}

}
