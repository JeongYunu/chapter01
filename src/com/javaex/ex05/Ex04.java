package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		int[] lottoNo = new int[7];
		
		for(int i=0; i<lottoNo.length; i++) {
			lottoNo[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<lottoNo.length; i++) {
			System.out.print(lottoNo[i]+"\t");
		}
		System.out.println("");
		System.out.println("");
		
		for(int i=0; i<lottoNo.length; i++) {
			lottoNo[i] += 1;
			System.out.print(lottoNo[i]+"\t");
		}

	}

}
