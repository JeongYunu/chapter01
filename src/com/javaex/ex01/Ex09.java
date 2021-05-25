package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {

		//관계 연산자 --> 결과는 true - false --> 결과는 boolean 형이다
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
		int n04 = 3;
		
		System.out.println(n01<n02); //n01은 n02보다 작냐? false
		System.out.println(n01>n02); //n01은 n02보다 크냐? true
		System.out.println(n01<=n02); //n01이 n02보다 작거나 같냐? false
		System.out.println(n01<=n03); //n01이 n03보다 작거나 같냐? true
		System.out.println(n01>=n02); //n01이 n02보다 크거나 같냐? true
		System.out.println(n01>=n03); //n01이 n04보다 크거나 같냐? true
		
		System.out.println(n01 == n02); //n01이 n02랑 같냐? false
		//System.out.println(n01=n02); //n02를 n01에 대입 
		System.out.println(n01 != n02); //n01이 n02랑 다르냐? true
		
		

	}

}
