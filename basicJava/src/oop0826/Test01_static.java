package oop0826;

import java.util.Calendar;

class Sawon {
	// 멤버변수 field
	// 월급계산
	String sabun;	// 사원번호
	String name;	// 이름
	int pay;		// 급여
	
	// 생성자 변수constructor
	public Sawon() {}
	
	// 생성자 함수 자동 코딩
	// 메뉴 Source
	// -> Generate Constructor using Field
	public Sawon(String sabun, String name, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}
	
	// static 변수
	static String COMPANY="(주)솔데스크";
	static int SUDANG=10;
	static double TAX=0.03;

	// static 함수
	static void line() {
		System.out.println("--------------");
	}// end
	
	
}// class end

public class Test01_static {

	public static void main(String[] args) {
		// static
		// -> 함수, 변수(정적변수)
		// -> 메모리 생성 1번, 소멸도 1번 된다.
		// -> new 연산자를 이용해서 별도의 객체 생성 없이 사용
		
		// static은 클래스 명으로 직접 접근 가능하다.
		// -> 클래스.변수
		// -> 클래스.함수()
		// System.out.println(Math.PI);	//멤버 변수
		// System.out.println(Math.abs(3));//멤버 함수
		
		/*	에러
		Math math = new Math();
		System.out.println(math.PI);	//멤버 변수
		System.out.println(math.abs(3));//멤버 함수
		*/
		
		/*
		System.out.println(Calendar.YEAR);	//1
		System.out.println(Calendar.MONTH);	//2
		System.out.println(Calendar.DATE);	//5
		
		System.out.println(Calendar.HOUR);	//10
		System.out.println(Calendar.MINUTE);//12
		System.out.println(Calendar.SECOND);//13
		*/
		
		
//--------------------------------------------------
		
		//static 변수와 함수는 클래스명으로 직접 접근한다.
		/*
		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.SUDANG);
		System.out.println(Sawon.TAX);
		Sawon.line();
		*/
		
//--------------------------------------------------		
		/*
		//1) static의 특징을 적용하지 않는 경우(비추)
		//new 생성자함수() -> 객체(Object)
		//one -> 참조변수
		Sawon one=new Sawon("1001", "개나리", 100);
		
		//세금
		double myTax=one.pay * one.TAX;
		
		//총 지급액 = 급여 - 세금 + 수당
		int total = (int)(one.pay-myTax+one.SUDANG);
		
		System.out.println("회사 : " + one.COMPANY);
		System.out.println("사번 : " + one.sabun);
		System.out.println("이름 : " + one.name);
		System.out.println("총 지급액 : " + total);
		one.line();
				
//--------------------------------------------------		
		
		//2)static의 특징을 적용한 경우(강추)
		//->static변수와 함수는 이미 static 메모리에
		//->값이 상주해 있기 때문에 별도의 객체생성을
		//->하지 않고도 직접 접근할 수 있다.
		Sawon two = new Sawon("1002","진달래",200);
		myTax=two.pay*Sawon.TAX;
		total=(int)(two.pay-myTax+Sawon.SUDANG);
		
		System.out.println("회사 : " + Sawon.COMPANY);
		System.out.println("사번 : " + two.sabun);
		System.out.println("이름 : " + two.name);
		System.out.println("총 지급액 : " + total);
		Sawon.line();
		*/
		
//--------------------------------------------------		
		
		//static 변수의 연산
		//static 변수는 생성도 1번, 소멸도 1번
		//주소를 공유한다.
		
		Sawon kim=new Sawon("1003", "무궁화", 300);
		Sawon lee=new Sawon("1004", "봉선화", 400);
		
		System.out.println(kim.SUDANG); // 10
		System.out.println(lee.SUDANG); // 10
		
		kim.SUDANG=kim.SUDANG+1;
		System.out.println(kim.SUDANG); // 11
		
		lee.SUDANG=lee.SUDANG+1;
		System.out.println(lee.SUDANG); // 12
		
		Sawon.SUDANG=Sawon.SUDANG+1;
		System.out.println(Sawon.SUDANG); // 13
		System.out.println(kim.SUDANG);	// 13
		System.out.println(lee.SUDANG);	// 13
		
		
		
	}// main() end
}// class end
