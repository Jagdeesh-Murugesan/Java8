package com.fp.training;

public class Topic2Default_Static_Mthds {

	interface InterfaceA {

		public default void sayHello() {
			System.out.println("Hi A");
		}

		public default void sayBye() {
			System.out.println("Bye A");
		}
		
		public static String helperMethod() {
			return "A is here";
		}
	}

	interface InterfaceB extends InterfaceA {

		public default void sayHello() {
			System.out.println("Hi B");
		}
		
		public static String helperMethod() {
			return "B is here";
		}
	}

	static class DefaultMain //extends baseClass 
	                         implements InterfaceB //,InterfaceC
	{
		
		public static void main(String[] args) {
			InterfaceB b = new DefaultMain();
			b.sayHello();
			b.sayBye();		
			
			System.out.println(InterfaceB.helperMethod());
			System.out.println(InterfaceA.helperMethod());

		}
	}
	
	static class baseClass {
		public void sayHello() {
			System.out.println("Hi C");
		}
	}
	
	interface InterfaceC  {

		default void sayHello() {
			System.out.println("Hi C");
		}
		
		static String helperMethod() {
			return "C is here";
		}
	}

}
