package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("=============");
		
		//배열복사 arrA[i] 를 arrB[i]에 대입
		int[] arrB =new int[3];
		
		for(int i = 0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
			System.out.println(arrB[i]);
		}

		System.out.println("=============");
		arrA[1] = 100;
		System.out.println(arrA[1]);
		
		System.out.println("=============");
		//arrB[1] = 30;
		System.out.println(arrB[1]);
		
	}

}
