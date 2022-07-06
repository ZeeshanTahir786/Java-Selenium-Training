package abstraction;

public class Mobile_main {

	public static void main(String[] args) {
		Mobile m;
		
		m = new Ios();
		m.abc();
		m.doubleTap();
		
		m = new Android();
		m.abc();
		m.doubleTap();
	}

}
