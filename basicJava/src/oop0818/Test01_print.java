package oop0818;

public class Test01_print {

	public static void main(String[] args) {
		// 콘솔창 출력
		System.out.print(123);					
		System.out.print(456);					//123456789
		System.out.print(789);
		
		// 출력하고 줄바꿈(엔터)
		System.out.println(123);				// 123
		System.out.println(456);				// 456
		System.out.println(789);				// 789
		
		// 문자열 데이터 구분 기호"
		System.out.println("자바");				// 자바
		System.out.println("파이선");				// 파이선
		System.out.println(123);				// 123
		System.out.println("123");				// 123
		
		// " ' \등을 단순 기호로 인식하고자 할때
		System.out.println("\"");				// "
		System.out.println("\'");				// '
		System.out.println("\\");				// /
		
		// + 연산자
		System.out.println(10+20);				// 30
		System.out.println("10"+"20");			// 1020
		System.out.println("10"+20);			// 1020
		System.out.println(10+"20");			// 1020
		System.out.println("10+20");			// 10+20
		
		
	} //main() end
} // class end
