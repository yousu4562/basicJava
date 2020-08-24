package oop0820;

public class Test01_for {

	public static void main(String[] args) {
		// for 반복문
		// for (초기값; 종료값; 증감) {반복 하고자 하는 명령어들}
		// for (;;) {} 무한LOOP
		
		// 증가에 따른 반복
		for(int a=1; a<=3; a=a+1) {
			System.out.println("JAVA");
		}// for end
		
		/*
			a=1 -> 1<=3 => true -> JAVA ->
			a=1+1 -> 2<=3 -> true -> JAVA ->
			a=2+1 -> 3<=3 -> true -> JAVA ->
			a=3+1 -> 4<=3 -> false -> end
		*/
		
		// a변수는 for안에서만 유효하다.
		// System.out.println(a); 에러
		
		// SCOPE 유효범위
		// 변수
		// -> 전역 변수 global variable
		// -> 지역 변수 local variable
		
		// 감소에 따른 반복
		int b;
		for(b=3; b >= 1; b=b-1) {
			System.out.println("Python");
		}// for end
		
		System.out.println(b); // 0
		
//-----------------------------------------------
		// 구구단 2~9단 출력
		for(int dan=2; dan<=9; dan++) {
			System.out.println("");
			System.out.println("** " + dan + "단 **");
			for(int n=1; n<=9; n=n+1) {
				System.out.println(dan + "*" + n + "=" + (dan*n));
			} // for end
		} // for end

//-------------------------------------------------------------------		
		
		// continue 반복문 계속 실행
		for(int a=1; a<10; a++) {
			if(a==5) continue;
			System.out.print(a);
		} // for end
		/*
		a=1 -> a<10 -> true -> a==5? -> false -> print(a) -> a=2
		a<10 -> true -> a==5? -> false -> print(a) -> a=3
		a<10 -> true -> a==5? -> false -> print(a) -> a=4
		a<10 -> true -> a==5? -> false -> print(a) -> a=5
		a<10 -> true -> a==5? -> true -> continue -> a=6
		...
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main() end

}// class end
