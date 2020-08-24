package oop0818;

public class Test03_operator {

	public static void main(String[] args) {
		// 산술연산자
		/*
		System.out.println(5+3);// 8
		System.out.println(5-3);// 2
		System.out.println(5*3);// 15
		System.out.println(5/3);// 1 몫 자바는 정수를 정수로 나누면 실수가 절대 안나옴
		System.out.println(5%3);// 2 나머지
		
		System.out.println(3/5);// 0
		System.out.println(3%5);// 3
		
		System.out.println(3/5.0);// 0.6
		System.out.println(3/5.);// 0.6
		*/
		
		// 비교연산자
		/*
		System.out.println(5<3);
		System.out.println(5>3);
		System.out.println(5<=3);
		System.out.println(5>=3);
		System.out.println(5==3); // 같다
		System.out.println(5!=3); // 같지 않다.
		*/
		
		// 논리연산자
		// AND -> &&
		// OR  -> ||
		// NOT -> !
		
		// 윤년 구하는 공식
		int y=2020;
		System.out.println(y%4==0 && y%100!=0 || y%400==0);
		
		boolean flag=true;
		System.out.println(!flag);

		
	}//main() end

} //class end
