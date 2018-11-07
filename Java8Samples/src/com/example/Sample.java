package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {

     		
		List<Integer> numbers = Arrays.asList(1,2,3,2,1);
		
//		numbers.stream()
//				.map(a -> getStars(a))
//				.forEach(System.out::print);
		
		String x = "mam";
		
	    if( IntStream.range(0, x.length() / 2)
	      .noneMatch(i -> x.charAt(i) != x.charAt(x.length() - i - 1))) {
	    	System.out.println("It is pallindrom");
	    }
	    else {
	    	System.out.print("It is not pallindrom");
	    }
		
	}
	
		
	static String getStars(Integer a){
		int i =0;
		String x = "" ;
		while(++i<=a) {
			x = x+"*";
		}
		return x+"\n";
	}

}
