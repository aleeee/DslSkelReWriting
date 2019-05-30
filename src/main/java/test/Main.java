package test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> l = (ArrayList<String>) Stream.of("one", "two", "three", "four").collect(Collectors.toList());
        l.stream().filter(e -> e instanceof String).findFirst().ifPresent(t-> System.out.println( l.indexOf(t)) );
//        .peek(e -> System.out.println("Filtered value: " + e))
//        .map(String::toUpperCase);
//        .peek(e -> System.out.println("Mapped value: " + e))
//        .collect(Collectors.toList());

	}

}
