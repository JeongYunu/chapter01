package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {

		for(int i=1; i<=6; i++) {
			for(int s=1; s<=6; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("끝");
		System.out.println();

		for(int i=1; i<=6; i++) {
			for(int s=1; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("끝");
	}

}
