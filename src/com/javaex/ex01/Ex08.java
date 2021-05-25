package com.javaex.ex01;

public class Ex08 {

		public static void main(String[] args) {
			
			
			//대입연산자
			System.out.println("대입연산자----------------");
			int a = 7;
			int b = 2;
			System.out.println(a);
			System.out.println(b);
			
			//산술연산자
			System.out.println("산술연산자----------------");
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			
			System.out.println(a/b); // 7/2 -> 3
			System.out.println(a%b); // 7/2 -> 몫빼고 나머지값 1
			
			//산술연산자 / %
			System.out.println("산술연산자  /  % 자세히-----");
			System.out.println(7.0 / 2.0);
			System.out.println(11.0 % 2.0);
			
			//부호연산자
			System.out.println("부호연산자----------------");
			int var = -3;
			int pVar = +var;
			int mVar = -var;
			var = -var;
			System.out.println(var);
			System.out.println(pVar);
			System.out.println(mVar);
			System.out.println(var);
			
			//증가,감소 연산자
			System.out.println("증감연산자----------------");
			//prefix
		    System.out.println(a); //a=7
		    System.out.println(++a);//계산되어 출력됨
		    System.out.println(a); //a=8이됨 값이 변함 (중복가능)
		    
		    System.out.println(b); //b=2
		    System.out.println(--b);
		    System.out.println(b);
		    
		    System.out.println("증감연산자 뒤--------------");
		    System.out.println(a); //a=8
		    System.out.println(a++); //출력먼저하고 계산됨
		    System.out.println(a);
		    
		    System.out.println(b); //b=1
		    System.out.println(b--);
		    System.out.println(b);
			 
			
		}
}
