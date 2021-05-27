package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		boolean action = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(action) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("비밀을 알아냈구나?");
				System.out.println("종료");
				action = false;
			}else if(num%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			System.out.println("************");
		}
		
		sc.close();
		
		
		
	}

}
