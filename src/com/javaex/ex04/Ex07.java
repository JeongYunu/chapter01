package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {

		int i=1;
		
		while(true) {
			if(i%7==0 && i%14==0) {
				System.out.println(i);
				break;
			}else {
				i++;
			}
		}
	}

}
