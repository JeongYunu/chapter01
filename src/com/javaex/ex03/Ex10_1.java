package com.javaex.ex03;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int day;
		String m = "일 입니다";
	
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			default: 
				day = 0;
				break;
		}
		System.out.println(day + m);
		
		sc.close();

	}

}
