package oop0826;

import java.util.Calendar;

//1) final 클래스(종단 클래스)
final class Animal{}//class end

/* 에러
   final 클래스를 상속 받을수 없다.	
class Elephant extends Animal {}
*/

//2) final 메소드
class Fruit{
	void view() {}
	final void disp() {}
}//class end

class Apple extends Fruit{
	     //부모클래스 =Fruit
	@Override // <- annotation
			  // <- 재정의(리폼)
	void view() {}
	
	/* 에러
	   final 메소드는 더이상 override할 수 없다.
	@Override
	void disp() {}
	*/

}//class end


public class Test02_final {
	public static void main(String[] args) {
		// final 마지막
		// 변수	: 변수의 상수화
		// 함수	: 더이상 리폼(override재정의)할 수 없다. 
		// 클래스 : 종단클래스, 부모클래스가 될수 없다.
		
		int a= 3;
		a=5; // 다른값으로 대입가능
		
		final int b=2; // 변수의 상수화
		// b=4; 에러
		// final 변수는 다른 값으로 대입 불가능
		
		// static final int YEAR=1
		System.out.println(Calendar.YEAR);
		
		
	}//main() end
}//class end
