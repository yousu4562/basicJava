package oop0826;

import java.lang.*;;	// <- 자바의 가장 기본 패키지
					// <- 생략할수 있다.


public class Test05_wrapper {
	public static void main(String[] args) {
		// wrapper(포장) 클래스
		// -> 기본 자료형을 참조형화 해 놓은 클래스들
		// -> 대부분 java.lang에 선언되어 있음
		
		
		// 기본형			클래스
		/*
		   boolean		Boolean  
		   byte			Byte
		   short		Short
		   int			Integer
		   long			Long
		   float		Float
		   double		Double
		   char			Character
		*/
		
//------------------------------------
		
		boolean boo1=true;
		
		//실선 -> 절판 depercated 
		Boolean boo2=new Boolean(false);
		Boolean boo3=new Boolean("true");
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
		
//----------------------------------------
		
		int in1=3;
		Integer in2=new Integer(5);
		Integer in3=new Integer("7");
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		
		Integer in4=9;
		System.out.println(in2.doubleValue());	//5.0	
		System.out.println(in3.longValue());	//7L
		
		
		//빨간색 s -> static의 약자
		//static -> 클래스.멤버
		System.out.println(Integer.toBinaryString(9)); // 2진수
		System.out.println(Integer.toOctalString(10)); // 8진수
		System.out.println(Integer.toHexString(11));   // 16진수
		
		System.out.println(Integer.max(3, 5));	//5
		System.out.println(Integer.min(3, 5));	//3
		System.out.println(Integer.sum(3, 5));	//8
		
		//★★★
		//"123" -> 123
		System.out.println(Integer.parseInt("123"));

		
//------------------------------------------
		
		long lo1=3L;
		Long lo2=new Long(5);
		Long lo3=new Long("7");
		
		double dou1=1.2;
		Double dou2=new Double(3.4);
		Double dou3=new Double("5.6");
		// 문제) 실수형값들중에서 정수의 합을 구하시오
		int hap=(int)dou1+dou2.intValue()+dou3.intValue();
		System.out.println(hap);

//------------------------------------------
		
		char ch1='R';
		Character ch2 =new Character('r');
		System.out.println(ch1);
		System.out.println(ch2.toString());
		
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.toUpperCase('n'));
		System.out.println(Character.toLowerCase('M'));
				
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
