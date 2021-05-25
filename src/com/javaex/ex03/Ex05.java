package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pay = 10000;
		double pay8 = pay*1.5;
		int pay9 = (int)pay8;
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time<=8) {
			time = time*pay;
			System.out.println(time);
		}else if(time>8) {
			time = time-8;
			int aaa = time*pay9+80000;
			System.out.println("임금은 " + aaa + "원 입니다.");
		}
		
		sc.close();
		
		
		
	}
}
