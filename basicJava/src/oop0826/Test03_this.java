package oop0826;

class Sungjuk{
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	public Sungjuk() {//기본 생성자 함수
					  //default constructor
		// 생성자 함수가 다른 생성자 함수를 호출할 수 있다.
		// Sungjuk("개나리"); 에러
		this("개나리");
	}//end
	
	public Sungjuk(String name) {
		this.name=name;
		//thus.멤버변수 (field) = 매개변수(parameter)
	}//end
	
	public Sungjuk(int kor, int eng, int mat) {
		this("홍길동");
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		// this("홍길동"); 에러 
		// 생성자 함수를 호출하는 경우 첫줄에서 호출한다.
	}//end
	
	public Sungjuk(int aver) {
		// 생성자 함수에서 일반 메소드 호출이 가능하다.
		disp();
	}//end
	
	public void disp() {
		//this(85); 에러
		//-> 일반 메소드는 생성자 함수를 호출 할 수 없다.
	}//disp() end
	
}//class end
public class Test03_this {
	public static void main(String[] args) {
		// this()
		//-> 자신의 생성자 함수가 자신의 생성자 함수를 호출할 때
		

	}//main() end
}//class end
