package com.javaex.ex03;

public class Ex15 {

	public static void main(String[] args) {

		int i;
		String s = "*";
		
		for(i=1; i<7; i++) {
			System.out.println("******");
		}
		System.out.println();
		
		for(i=1; i<7; i++) {
			
			System.out.println(s);
			s += "*";
		}
		System.out.println("천장이 빙글빙글 돈다 어지럽네");
	}

}
