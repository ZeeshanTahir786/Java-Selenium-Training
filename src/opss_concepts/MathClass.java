package opss_concepts;

import java.util.Random;
import java.util.UUID;

public class MathClass {
	/* * Math Class is provided in java.lang package. java.lang package provides 
	 * * classes that are fundamental to the design of the Java programming language. 
	 * * Math class contains methods for performing basic numeric 
	 * * operations such as the elementary exponential, logarithm, 
	 * * square root, and trigonometric functions. 
	 *  
	 * * Math.min, Math.max, Math. E, Math.PI, 
	 * * Math.pow, Math.sqrt, Math.cbrt 
	 * * Math.ceil, Math.floor, Math.round
	 *  * Math.sin, Math.cos, Math. tan, Math. log10 
	 *  * Math.random */
	
	public static void main(String[] args) {
		Random r1 = new Random();

		System.out.println(r1.nextInt(1000));
		System.out.println(Math.round(Math.random() * 1000));
		
		System.out.println(UUID.randomUUID());
	}
}
