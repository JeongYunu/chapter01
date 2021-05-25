package com.javaex.ex03;

import java.util.Scanner;

public class Ex09_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String r1 = "R101호";
		String r2 = "R202호";
		String r3 = "R303호";
		String r4 = "R404호";
		String r5 = "상담원에게 문의하세요";
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		int num = sc.nextInt();
		
		switch (num) {
			case 1:
				System.out.println(r1);
				break;
			case 2:
				System.out.println(r2);
				break;
			case 3:
				System.out.println(r3);
				break;
			case 4:
				System.out.println(r4);
				break;
			default:
				System.out.println(r5);
				break;
			
		}
		
		sc.close();

	}

}
