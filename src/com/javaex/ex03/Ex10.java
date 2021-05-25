package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		String com = " 입니다.";
		String Jan = "31일";
		String Feb = "28일";
		String Mar = "31일";
		String Apr = "30일";
		String May = "31일";
		String Jun = "30일";
		String Jul = "31일";
		String Aug = "31일";
		String Sep = "30일";
		String Oct = "31일";
		String Nov = "30일";
		String Dec = "31일";
	
		System.out.println("월을 입력하세요");
		int mon = sc.nextInt();
		
		switch (mon) {
			case 1:
				System.out.println(Jan+com);
				break;
			case 2:
				System.out.println(Feb+com);
				break;
			case 3:
				System.out.println(Mar+com);
				break;
			case 4:
				System.out.println(Apr+com);
				break;
			case 5:
				System.out.println(May+com);
				break;
			case 6:
				System.out.println(Jun+com);
				break;
			case 7:
				System.out.println(Jul+com);
				break;
			case 8:
				System.out.println(Aug+com);
				break;
			case 9:
				System.out.println(Sep+com);
				break;
			case 10:
				System.out.println(Oct+com);
				break;
			case 11:
				System.out.println(Nov+com);
				break;
			case 12:
				System.out.println(Dec+com);
				break;
				

			//default:
				//break;
			
		}
		
		sc.close();

	}

}
