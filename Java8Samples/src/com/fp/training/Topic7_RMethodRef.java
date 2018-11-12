package com.fp.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Topic7_RMethodRef {
	
	
	
	
	@FunctionalInterface
	interface MyInterface {
		//1. Method reference to an instance method of an object
		void display();
		
		//2. Method reference to a static method of a class
		static String sayHello() {
			return "Hi There";
		}
	}

	static public class Example {
		
		public void myMethod() {
			System.out.println("Instance Method");
		}

		public static void main(String[] args) {
			Example obj = new Example();
			
			//1. Method reference using the object of the class
			MyInterface ref = obj::myMethod;
			ref.display();
			
			//2. A method reference to a static method.
			Supplier<String> hello = MyInterface::sayHello;
			System.out.println(hello.get());
			
			//3. Method reference to an instance method of an arbitrary object of a particular type
			List<String> strings = Arrays
			        .asList("how", "to", "do", "in", "java", "dot", "com");
			 
			List<String> sorted = strings
			        .stream()
			        .sorted((s1, s2) -> s1.compareTo(s2))
			        .collect(Collectors.toList());
			 
			System.out.println(sorted);
			 
			List<String> sortedAlt = strings
			        .stream()
			        .sorted(String::compareTo)
			        .collect(Collectors.toList());
			 
			System.out.println(sortedAlt);
			
			//4. Method reference to a constructor
			List<Integer> integers = IntStream
	                .range(1, 100)
	                .boxed()
	                .collect(Collectors.toCollection( ArrayList::new ));
	 
			System.out.println(integers.stream().reduce(Math::max).get());
			
		}
	}

}
