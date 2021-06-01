package com.javaex.ex05;


//java Ex11
//java Ex11 i am jeong yun woo
public class Ex11 {

	public static void main(String[] args) {


		/*
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		if(args.length>0) {
			if(args[0].equals("-version")) { // Ex11 -version
				System.out.println("Ex11 버전: 3.4343");
			}else if(args[0].equals("-help")) {  // Ex11 -help
				System.out.println("지금부터 도움말 어쩌고 저쩌고");
				System.out.println("[-version] : 버전정보를 확인할 수 있습니다.");
				System.out.println("[-help] : 도움말을 볼 수 있습니다.");
			}else { // Ex11 i am jeong yun woo
				for(int i=0; i<args.length; i++) {
					System.out.println(args[i]);
				}
			}
			
		}

	}

}
