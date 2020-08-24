package oop0824;

public class Test01_method {
	
	
	// 1) 메소드 (멤버함수)작성 영역
	
	// void 리턴값이 없다.
	public static void test1() {
		System.out.println("JAVA");
	} // test1() end
	
	public static void test2() {
		System.out.println("Python");
		// 함수는 호출한 시점으로 돌아간다.
		return; // 마지막 return 명령어는 생략 가능
	} // test2() end
	
	public static void test3(int a) {
		// a는 매개변수(parameter)
		System.out.println(a);
		return; // 생략가능
	}// test3() end
	
	public static void test4(int a, int b, int c) {
		// 매개변수는 개별적으로 선언한다.
		System.out.println(a+b+c);
	}// test4() end
	
	public static void test5(double a, double b) {
		System.out.println(a+b);
	}// test5 ()end
	
	public static void test6(char ch, byte num) {
		for(int a =1; a<=num; a++) {
			System.out.print(ch);
		}// for end
	}// test6() end
	
	
	public static void main(String[] args) {
		// Method 메소드 ★★★★★
		// 함수, function, procedure
		// -> 일정한 기능을 가지고 있는 것
		// -> 형식) 리턴형 함수명(){} 
		// 식별자 : 프로젝트명 basicjava
		//		    패키지 명 oop0824
		//		    클래스 명 Test01_method
		// 		    변수명, 함수명
		
		// "test" 문자열 상수
		// test 변수
		// test() 함수
		
		// 사용자 정의 함수(user defined)
		// -> 함수 작성시 고려사항 : 매개변수(parameter), 리턴값
		// -> 함수는 정의(작성)하고, 함수를 호출함으로써 수행된다.
		
//-------------------------------------------------------
		
		// 1) 전달값(argument value)이 없는 경우
		
		test1(); // 함수 호출
		test1();
		test1();
		
		test2();
		test1();
		test2();
		
//--------------------------------------------------------
		
		// 2) 전달값이 있는 경우
		test3(10);
		test3(20);
		test3(30);
		
		// 전달값은 1개이상 가능하다.
		test4(7,8,9);
		
		test5(1.2, 3.4);
		
		byte num=100;
		test6('#', num);
		
	}// main() end
}// class end
