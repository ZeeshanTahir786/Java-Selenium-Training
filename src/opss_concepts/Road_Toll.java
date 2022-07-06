package opss_concepts;

public class Road_Toll {
	String type;
	int tiresCount;
	
	public void calculateTall() {
		if(tiresCount == 2) {
			System.out.println("Your tall amount is 0");
		} else if(tiresCount == 4) {
			System.out.println("Your tall amount is 10");
		} else if(tiresCount > 4) {
			System.out.println("Your tall amount is 20");
		} else {
			System.out.println("Invalid tyres amount");
		}
	}
	public Road_Toll() {
		System.out.println("Constructor is executed");
	}
	public Road_Toll(String type,int tiresCount) {
		this.tiresCount = tiresCount;
		this.type = type;
	}
}
