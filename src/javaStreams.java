import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class javaStreams {

	public static void main(String[] arg) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Hafiz");
		names.add("Ahsan");
		names.add("Ali");
		names.add("Anjum");
		names.add("Tanzeela");

//		int count = 0;
//		for (String name : names) {
//			if (name.startsWith("A")) {
//
//				count++;
//			}
//		}
//		System.out.println(count);

//		Same thing can achieve wiht Java Streams

		long count = names.stream().filter(a -> a.startsWith("A")).count();
//		.filter // Intermediate Operator
//		.count // Terminal Operator

//		There is no life for intermediate operator if there is not terminal Operator
//		Terminal Operator will execute only if Intermediate operator returns true
		System.out.println(count);

		long d = Stream.of("Hafiz", "Ahsan", "Ali", "Anjum", "Tanzeel").filter(a -> a.startsWith("A")).count();

		long b = Stream.of("Hafiz", "Ahsan", "Ali", "Anjum", "Tanzeel").filter(a -> {
			a.startsWith("A");
			return false;
		}).count();
		// it returns false so filter operator will not execute.
		System.out.println(b);

		names.stream().filter(a -> a.length() > 3).forEach(a -> System.out.println(a));

		names.stream().filter(a -> a.length() > 3).limit(2).forEach(i -> System.out.println(i.toUpperCase()));
//		print names which have 	last letter as "a" with uppercase
		names.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

//		To convert array into a arraylist we have a method 
//		Array.asList(arr);

//		Print names which have first letter as "A" with uppercase and sorted

		List<String> name = Arrays.asList("Hafiz", "Ahsan", "Ali", "Anjum", "Tanzeel");
		name.stream().filter(a -> a.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(a -> System.out.println("Hyy "+a));
	}
}
