package com.fp.prerequisite;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	static class Stack<T>{
		
		List<T> list;
		

		public Stack(List<T> list) {
			this.list = list;
		}

		public void push(T t) {
			list.add(t);
		}
		
		T pop() {
			return list.get(list.size()-1);
		}
		
	}
	 
	 public static void main(String[] args) {
		 
		Stack<String> stack = new Stack<>(new ArrayList<String>());
		stack.push("a");
		System.out.println(stack.pop());
		
		Stack<Long> stackLong = new Stack<>(new ArrayList<Long>());
		stackLong.push(1L);
		System.out.println(stackLong.pop());
	}

}
