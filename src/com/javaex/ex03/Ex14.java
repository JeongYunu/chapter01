package com.javaex.ex03;

public class Ex14 {

	public static void main(String[] args) {

		int dan;
		int i;
		
		for(dan=2; dan<10; dan++) {
			
			System.out.println(dan + "단");
			for(i=1; i<10; i++) {
				
				System.out.println(dan + " x " + i + " = " + dan*i);
				
			}
			
			System.out.println("============");
			
		}

	}

}
