package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pay = 10000;
		int pay8 = 12000;
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time<=8) {
			time = time*pay;
			System.out.println("임금은 " + time + "원 입니다.");
		}else if(time>8) {
			time = time-8;
			int aaa = time*pay8+80000;
			System.out.println("임금은 " + aaa + "원 입니다.");
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
