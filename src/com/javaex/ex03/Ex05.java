package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pay01 = 10000;
		//int pay02 = (int)(pay01*1.5);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time>8) {
			int pay = 8*pay01+(time-8)*(int)(pay01*1.5);
			System.out.println("임금은 " + pay + "원 입니다.");
		}else {
			int pay = time*pay01;
			System.out.println("임금은 " + pay + "원 입니다.");
		}
		
		sc.close();
		
		
		
	}
}
