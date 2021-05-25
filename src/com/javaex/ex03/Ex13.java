package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		int i;
		int o;
		
		for(o=0, i=1; i<=10; i++) {
			
			o += i;
			System.out.println(i + " 까지의 합은 " + o);
		}
		System.out.println("1부터 10까지의 정수의 합은" + o + " 입니다.");

	}

}
