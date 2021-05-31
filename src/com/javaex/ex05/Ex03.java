package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		int[] lottoNo = new int[6];
		
		for(int i=0; i<6; i++) {
			lottoNo[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<lottoNo.length; i++) {
			System.out.print(lottoNo[i]+"\t");
			
		}
	}

}
