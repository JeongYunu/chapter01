package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pay01 = 10000;
		int pay02 = 12000;
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time>8) {
			int pay = 8*pay01 + (time-8)*pay02;
			System.out.println("임금은 " + pay + "원 입니다.");
		}else {
			int pay = time*pay01;
			System.out.println("임금은 " + pay + "원 입니다.");
		}
		
		sc.close();

	}

}

/*
 Scanner
 time
 if 1~8 = time*10000
 else 8~ = time*12000
 */
