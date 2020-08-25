package oop0825;

import java.util.GregorianCalendar;

class School{
	// 멤버변수 field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	// 생성자 함수 Constructor
	// -> 클래스 명과 동일한 함수.
	// -> 리턴형이 없다.
	// public void School() {} // 에러는 아니지만 객체생성이 안된다.
	public School() {
		// 기본 생성자 함수
		// default constructor
		// 자동 생성된다.
		System.out.println("School()...");
	}// School end
	
	// 생성자 함수도 오버로딩(중복정의)이 가능하다.
	// 매개변수의 자료형을 다르게 하면 가능.
	public School(String n) {
		name = n;
	}// end
	
	public School(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}// end
	
	public School(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}// end
	
	// 멤버함수 method
	public void calc() {
		aver=(kor+eng+mat)/3;
	}// end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}

	
	
} // class end

public class Test02_constructor {

	public static void main(String[] args) {
		// 생성자함수 Constructor
		// -> 클래스명과 동일한 함수
		// -> new 연산자와 함께 메모리 할당 할 때 사용한다.
		// -> 오버로딩이 가능하다
		
		// 소멸자함수 Destructor -> 자바에는 없다.
		// 가비지 콜렉팅(Garbage Collecting)
		// -> JVM이 자동으로 메모리를 회수함.
		
		/*
		GregorianCalendar today =new GregorianCalendar();
		if(today.isLeapYear(2020)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}// if end
		*/
		
		// new School(); // 객체 Object
		// new School();
		
//--------------------------------------------------------------		

		// one -> 참조변수(reference)
		School one = new School(); // 주소1 발생 
		one.calc();
		one.disp();
		
		/*
		// null : 비어있는 값
		String a= "";	// 빈 문자열
		String b=null; 	// 변수 선언만 해놓은 것
						// 메모리 할당 x
		System.out.println(a.length()); // 0
		System.out.println(b.length()); // NullPointerException 에러
		*/
		
//----------------------------------------------------------------
		
		
		School two = new School("개나리"); // 주소2 발생
		two.calc();
		two.disp();
		
		School three = new School(10,15,25);
		three.calc();
		three.disp();
		
		School four = new School("무궁화", 40, 45, 55);
		four.calc();
		four.disp();
		
		
//----------------------------------------------------------------
		// String 클래스
		
		String str1="HAPPY";
		String str2=new String("APPLE");
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}// main() end
}// class end
