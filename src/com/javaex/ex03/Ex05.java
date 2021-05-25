package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pay = 10000;
		int pay8 = (int)(pay*1.5);
		
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time<=8) {
			time = time*pay;
			System.out.println(time);
		}else if(time>8) {
			time = time-8;
			int aaa = time*pay8+80000;
			System.out.println("임금은 " + aaa + "원 입니다.");
		}
		
		sc.close();
		
		
		
	}
}
