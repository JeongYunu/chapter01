package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		int i;
		
		for( i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		System.out.println(dan + "단 입니다.");
		
		sc.close();
		

	}

}
