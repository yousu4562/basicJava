package oop0825; // <- 현재 클래스의 저장위치
				 // <- 패키지는 한번만 선언한다.

// 클래스를 사용하려면 저장위치(package)를 선언하고 사용한다.

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.Arrays;

class Sungjuck{ // 클래스명의 첫글자는 대문자로 한다.
				// package class Sungjuck 
				// package 는 생략한다.
	
	/*		
		Access Modifier 접근제어, 접근수정
		-> private 		비공개 / calss 내부에서만 접근가능하다. 은폐할 수 있다.
		-> package		생략한다. / 현재 package 내에서만 접근 가능 
		-> protected	상속관계에 있는 클래스가 다른 패키지에 있는 경우
		-> public		공개 / basicJava 프로젝트 내에서 모두 접근 가능
	*/
	
	
	// 멤버변수 field
	public String name; 	// class 외부에서 접근 가능하다.
	int kor, eng, mat;		// package가 생략 되어있다.
	private int aver;		// class 내부에서만 접근 가능
	
	
	// 멤버함수 method
	private void view() {}// view end
	
	void calc() {
		// 클래스 내부의 멤버들 간에는
		// Access Modifier와 상관없이 접근이 가능하다.
		aver=(kor + eng +mat)/3;
		
	}// calc end

	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
		
	}//disp end
	

}// class end



public class Test01_class {

	public static void main(String[] args) {
		// 클래스 class
		// -> 클래스명의 첫 글자는 대문자로 한다.
		// -> 구성 멤버 : 멤버변수(field) + 멤버함수(method) // 클래스안에 선언되어 있는 변수와 함수 
		
		
		// System.out.println(Math.PI);		// 멤버변수
		// System.out.println(Math.abs(3));	// 멤버함수
		
		
		// new 연산자
		// -> class를 사용하려면 메모리를 할당하고 사용한다.
		// -> 메모리 할당 형식) new 생성자함수()
		//					-> 객체(Object)라고 한다.
		
		
		// 기본자료형
		// a 는 변수
		// int a=3; // 4바이트 할당.
		
		
		// class -> 참조(reference)자료형
		// RAM의 heap영역에 메모리가 할당되고
		// 주소값이 발생된다.
		// new Sungjuck();	// 객체 Object

//---------------------------------------------
		
		// Sungjuck 클래스는 사용자 정의 자료형
		
		// sj 참조변수 (reference)
		Sungjuck sj =new Sungjuck();
		
		// 참조변수를 통해서 객체에 접근하는 연산자 (.)
		sj.name="손흥민";
		sj.kor=80;
		sj.eng=95;
		sj.mat=100;
		// sj.aver= 에러
		// private 속성은 클래스 내부에서만 사용할 수 있음.
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		System.out.println();
		
		// sj.view() 에러
		// private 속성은 클래스 외부에서 접근 불가능
		
		sj.calc();
		sj.disp();
		
//---------------------------------------------------
		System.out.println();
		
		// 객체지향 문법의 특징
		// -> 정보 은닉
		// -> 캡슐화
	
		Sungjuck sungjuck = new Sungjuck(); // sj랑 다른 위치에 메모리 할당
		sungjuck.name = "박지성";
		sungjuck.kor = 50;
		sungjuck.eng = 55;
		sungjuck.mat = 70;
		sungjuck.calc();
		sungjuck.disp();

//---------------------------------------------------
		System.out.println();
		
		// 참조변수가 가지고 있는 객체의 주소값
		System.out.println(sj.hashCode());
		System.out.println(sungjuck.hashCode());
		
		int a=5;
		int b=a;
		
		Sungjuck tmp=sj;
		System.out.println(tmp.hashCode());
	}// main() end
}// class end
