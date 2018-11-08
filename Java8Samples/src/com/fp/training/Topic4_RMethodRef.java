package com.fp.training;

import java.util.function.Supplier;

public class Topic4_RMethodRef {
	
	//3. Method reference to an instance method of an arbitrary object of a particular type
	//4. Method reference to a constructor
	
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
			// Method reference using the object of the class
			MyInterface ref = obj::myMethod;
			// Calling the method of functional interface
			ref.display();
			
			Supplier<String> hello = MyInterface::sayHello;
			
			System.out.println(hello.get());
		}
	}

}
