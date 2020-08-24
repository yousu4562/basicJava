package oop0819;

public class Test01_conversion {

	public static void main(String[] args) {
		// 객체지향프로그램 Object Oriented Program
		// 자료형 변환  Datatype Conversion
		// -> 자동형변환
		// -> 강제형변환(cast연산자)
		
		
		// 1)자동형변환
		// 정수형 : byte < short < int < long
		// 실수형 : float < double
		/*
		byte a=3;		
		int b=a;		//자동형변환
		long c=b;
		// a=c; 에러
		
		
		float d=1.2f;
		double e=d;		//자동형변환
		*/
		
//-------------------------------------------------------
		// 2)강제형변환
		// -> 필요한 곳에서 일시적으로 변환
		// -> (자료형)값
		/*
		System.out.println((int)3.5); // 3
		System.out.println((double)4); // 4.0
		System.out.println((int)2.6+(int)5.7); // 7
		System.out.println((int)(2.6+5.7)); // 8
		
		// 정수값을 계산하면 정수형만 반환된다.
		System.out.println(5/3); // 1
		System.out.println(5/3.0); // 1.6666666666666667
		System.out.println(5.0/3);
		System.out.println(5/3.);
		System.out.println(5/(double)3);
		System.out.println((double)5/3);
		*/

//-----------------------------------------------------------------
		// int형과 char형
		// ASCII코드값, ASCII문자, 키보드에 있는 문자,기호,숫자들은 코드값이있다.
		/*
		System.out.println(65);
		System.out.println((char)65); // 'A'
		System.out.println((char)66); // 'B'
		System.out.println((char)67); // 'C'
		
		System.out.println((char)97); // 'a'
		System.out.println((char)98); // 'b'
		System.out.println((char)99); // 'c'
		
		System.out.println((int)'A'); // 65
		System.out.println((int)'B'); // 66
		System.out.println((int)'C'); // 67
		
		System.out.println((int)'a'); // 97
		System.out.println((int)'b'); // 98
		System.out.println((int)'c'); // 99
		
		System.out.println('A'<'a'); // true
		
		System.out.println((int)'+'); // 43
		System.out.println((int)'-'); // 45
		System.out.println((int)'*'); // 42
		System.out.println((int)'/'); // 47
		
		System.out.println((int)' '); // 32 공백문자 아스키 코드값
		System.out.println((int)'\r'); // 13 엔터 아스키 코드값
		
		System.out.println((int)('a' - 'A')); // 32
		System.out.println("#"+(char)('a' - 'A')+"#"); // # #
		*/
//--------------------------------------------------------------
		// 문제) 임의의 문자가 소문자인지 확인하시오.
		// 		소문자 'a' ~ 'z'
		char ch='f';
		String result=('a' <= ch && ch <= 'z')? "는 소문자 입니다." : "는 대문자 입니다." ;
					// 'a' <= 'f'   f  <= 'z'
					// 		true		true
					//		true			  
		System.out.println(ch + result);
		
//---------------------------------------------------------------
		// 소스 분석
		int a=3, b=5;
		char op='+';
		// 출력결과 : 3+5=8
		System.out.println(a + op + b + "=" + (a+b)); // 51=8
					//	   3 + '+' + 5+ "=" +  (8)		
					//	   3 + 43  + 5   =  +   8
					//          51       =      8
					// ascii 코드값이 있는 기호는 입력할 때 조심
		System.out.println(a +""+ op +""+ b + "=" + (a+b)); // 3+5=8
			// String 사이에 껴있어서 '+' 정수값 대신 문자형으로 인식되어서 출력?
	
	}// main() end

}// class end
