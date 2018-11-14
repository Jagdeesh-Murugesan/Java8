package com.fp.training;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Topic4HigherOrderFunctions {                                       
  //A method is a function that is attached to a class or object.
  //A function has four parts:
  //1. name
  //2. Return type
  //3. Parameter list
  //4. Body
  
  //Lambdas are anonymous functions whose type is inferred. They have two things:
  // (parameter list) -> body
  
  public static void main(String[] args) {           
     Thread thread = new Thread(new Runnable() {
       public void run() {
         ;
       }
     });

    Thread thread1 = new Thread(() -> System.out.println("In another thread"));
    
    thread1.start();
    
    System.out.println("In main thread");
    String input = "Hello";
    Predicate<String> containsHello = str -> str.contains(input);
    
    System.out.println(checkString((str)->str.endsWith("there"),input));
    System.out.println(checkString((str)->str.startsWith("H"),input));
    System.out.println(containsHello.test("Hi Hello"));

    Function<Integer,String> convert = integer -> String.valueOf(integer);
    System.out.println(convert.apply(new Integer(2)));
    
    Supplier<String> greet = ()-> "Hello";
    System.out.println(greet.get());
    
    Consumer<String> recieve = (str)->System.out.println(str);
    recieve.accept("Hi there");
    
    //------------------------------

    UnaryOperator<String> appendHi = str -> "Hi"+str;
    System.out.println(appendHi.apply(" There"));
    
    BinaryOperator<String> appendHiThere = (s1,s2)-> "Hi There "+s1+s2;
    System.out.println(appendHiThere.apply(" HCSC"," freshers"));
    
    //We can pass objects to functions
    //We can create objects within functions
    //We can return objects from functions.
    
    //Higher order functions:
    //We can pass functions to functions
    //We can create functions within functions
    //We can return functions from functions.
    
  }
  
  static boolean checkString(Predicate<String> predicate, String input) {
	  return predicate.test(input);
  }
}


