package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		int[] lottoNo = new int[6];
		
		for(int i=0; i<6; i++) {
			lottoNo[i] = (int)(Math.random()*45)+1;
			System.out.print(lottoNo[i]+"\t");
			
		}
		
		/*
		lottoNo[0] = (int)(Math.random()*45)+1;
		lottoNo[1] = (int)(Math.random()*45)+1;
		lottoNo[2] = (int)(Math.random()*45)+1;
		lottoNo[3] = (int)(Math.random()*45)+1;
		lottoNo[4] = (int)(Math.random()*45)+1;
		lottoNo[5] = (int)(Math.random()*45)+1;
		
		System.out.println(lottoNo[0]);
		*/

	}

}
