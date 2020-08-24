package oop0824;

public class Test05_overload {
	
	public static void hap(int a) {
		System.out.println(a);
	}// hap() end
	
	public static void hap(int a, int b) {
		System.out.println(a+b);
	}// hap() end
	
	public static void hap(double a) {
		System.out.println(a);
	}// hap() end
	
	public static void hap(double a, double b) {
		System.out.println(a+b);
	}// hap() end
	
	public static void main(String[] args) {
		// Method Overload 함수 중복 정의
		// -> 함수명을 중복해서 사용할 수 있다.
		
		// 메소드 오버로딩의 전제조건
		// -> 매개변수의 갯수가 달라야 한다.
		// -> 매개변수의 자료형이 달라야 한다.
		
		hap(2);
		hap(3,5);
		hap(2.);
		hap(3., 5);
		
		System.out.println();
		
		// 절대값 구하기
		System.out.println(Math.abs(3)); // int 형
		System.out.println(Math.abs(4L)); // long 형
		System.out.println(Math.abs(5.6f)); // float 형
		System.out.println(Math.abs(7.8d)); // double 형
		
		System.out.println();
		
		System.out.println(Math.max(2, Math.max(4, 6)));
	}// main() end
}// class end
