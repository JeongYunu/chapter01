package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		while( i<10 ) {
			
			System.out.println(dan + " x " + i + " = " + dan*i );
			i++;
		}
		
		sc.close();

	}

}
