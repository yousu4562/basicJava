package oop0818;

public class Test02_datatype {

	public static void main(String[] args) {
		// Datatype 자료형
		// -> 기본 자료형, 참조 자료형(클래스)
		
//			[기본자료형]
		
		//	1) 정수형
			/*
			byte a;		// 메모리 1바이트 할당
			short b;	// 메모리 2바이트 할당 
			int c;		// 메모리 4바이트 할당 (기본)
			long d;		// 메모리 8바이트 할당
			
			a=3;
			b=5;
			c=7;
			d=9;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		 	*/
		
		//	2) 실수형
			/*
			// 접미사 f 반드시 추가, 4바이트 할당
			float a=1.2f ;
			// 접미사 d 생략가능, 8바이트 할당
			double b=3.4d ;		// 기본
			
			System.out.println(a);
			System.out.println(b);
		 	*/
		
		//	3) 문자형
			// 2바이트 할당 
			/*
			char ch = 'A' ;
			System.out.println(ch);
			ch = '가' ;
			System.out.println(ch);
			 */
		
		//	4) 문자열형
			/*
			String str = "Corona" ;
			System.out.println(str);
			
			str = "R" ;
			System.out.println(str);
					
			str=""; // 글자갯수 0
			System.out.println("#"+str+"#");
			
			str=" "; // 글자갯수 1
			System.out.println("#"+str+"#");
			
			// String은 클래스(참조자료형)
			*/
		//	5) 논리형
			/*
			// 맞다(true), 틀리다(false)
			boolean flag=true;
			System.out.println(flag);
			flag=false;
			System.out.println(flag);
			//true		-> 논리형
			//"true"	-> 문자열형
			*/
//----------------------------------------------------------
			// 성적프로그램
			String name = "홍길동" ;
			int kor = 80, eng = 85, mat = 100;
			double aver = (kor + eng + mat) / 3;
			
			System.out.println("이름: " + name);
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + mat);
			System.out.println("평균: " + aver);
			
			
			
	} //main() end
} // class end
