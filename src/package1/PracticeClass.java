package package1;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
//		byte b1 = 123;
//		short sh1 = 7654; 
////	int num1 = 456789; 
//		long l1 = 3456789; 
//		float f1= 12.5678f;
//		double d1= 234.456789;
//		char ch1 = 'A';
//		boolean b2 = true;
//		
//        System.out.println(b1);
        
//       int num1 = 100;
//       int num2 = 200;
//       int num3 = 300;
//        
//       if(num1 > num2) {
//        	System.out.println("Num1 ins greater"+num1);
//       } else  if(num2 > num3) {
//        	System.out.println("Num2 ins greater"+num2);
//       } else  if(num3 > num1) {
//        	System.out.println("Num3 ins greater"+num3);
//       } else  if(num2 > num1) {
//        	System.out.println("Num2 ins greater"+num2);
//       }
        
        
//         Write a program to find first 20 numbers of Fibonacci Series 
//         0 1 1 2 3 5 8 13 21
        
//        int num1 = 0;
//        int num2 = 1;
//		System.out.println(num1);
//		System.out.println(num2);
//
//        int num3 = 0;
//        for (int i = 1; i <= 18; i++) {
//        	num3 = num1 + num2;
//			System.out.println(num3);
//			num1 = num2;
//			num2 = num3;
//		}
//        
//        for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\n");
//
//		}
//        
//        String str1 = "ABCD";
//        String str2 = "Hello, I Love Java";
//
//        String pattern = "[A-Z]{1,}";
//        		
//        System.out.println(str1.matches(pattern));
//        System.out.println(str2.endsWith("Java"));
//        ----------------------------------------------------
//        write a program to reverse a string
//        String str1 = "Hello";
//        String temp= "";
//        for (int i = 0; i < str1.length(); i++) {
//			temp = str1.charAt(i) + temp;
//		}
//        System.out.println(temp);
        
//        -------------------------============================
        
        /* replace - normal
         * replaceAll - Regexp
         */
        
//        String str1 = "CONCENTRAT12340N 1234MPROVES W1234TH PRACT1234CE"; 
//        String str2 = "1234";
//        String str3 = "I";
//        
//        System.out.println(str1.replace(str2, str3));
//        
//        String str4 = "EI#STXHER #YOU CON#STRADCL Y50&U*R* #MXI^N^D O^R& I&*(T&W)";
//        String patt="[^A-Za-z0-9\\s]";
//        
//        System.out.println(str4.replaceAll(patt,""));
//		--------------============================================
//		toString
//		toBinaryString 
//		• tollexString • 
//		toOctal String • 
//		parseInt "/"
		
//		Integer to string
	    int num1 = 100; 
		System.out.println(Integer.toString(num1));
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toHexString(num1)); 
		System.out.println(Integer.toOctalString(num1));
		
		
//		String to Integer
		String str1 = "100"; 
		String str2 = "1100100";
		String str3 = "64"; 
		String str4 = "144"; 
		System.out.println(Integer.parseInt(str1)); // Convert to normal integer
		System.out.println(Integer.parseInt(str2, 2)); // Convert binary to integer
		System.out.println(Integer.parseInt(str3,16)); // Convert Hexa to integer
		System.out.println(Integer.parseInt(str4,8)); // Convert Octa to integer
		
	}

}
