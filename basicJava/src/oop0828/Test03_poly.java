package oop0828;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Father extends Object{
	//멤버변수 field
	public String name="아버지";
	public String addr="주소";
	
	//생성자함수 constructor
	public Father() {} // default constructor
	public Father(String name, String addr) {
		this.name = name;// this.멤버변수=매개변수
		this.addr = addr;
	}
	 
	//멤버함수 method
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}// disp()end
}//class end

class Son extends Father{
	public Son() {}
	public Son(String n, String a) {
		super.name=n;
		super.addr=a;
	}
}//class end

class Daughter extends Father{
	String friend="절친";
	public Daughter() {}
	public Daughter(String n, String a) {
		super(n,a);	//부모생성자함수 호출 super()
	}
}//class end


public class Test03_poly {
	public static void main(String[] args) {
		// 다형 Polymorphism
		// 상속관계에서의 다형성
		//->부모클래스의 입장에서 형태가 여러가지
		//->클래스들간의 형변환을 위해서
		
		
		//다형성의 예)
		//Calendar cal =new GregorianCalendar();
		
		
//---------------------------------------------------
		
		//1)일반적인 방식의 객체생성
		//->new 연산자 이용
		//->POJO(Plain Old Java Object)방식
		
		/*
		Father fa= new Father();
		fa.disp();
		
		Son son = new Son("손흥민","영국");
		son.disp();
		
		Daughter dau=new Daughter("김연아","한국"); 
		dau.disp();
		*/
		
//---------------------------------------------------
		
		//2) 다형성을 이용한 객체생성
		//-> 자식클래스가 부모클래스에 대입 가능하다.
		Father fa=new Son("개나리", "관철동");
		fa.disp();
		
		fa = new Daughter("진달래", "인사동");
		fa.disp();
		//자식클래스에 추가된 멤버변수는 다형성의 대상이 아니다.
		//fa.friend; 에러
		
		
//---------------------------------------------------
		
		//부모클래스도 자식클래스에 대입가능하다.
		//-> 단 , 자식클래스의 모양으로 형변환해야 한다.
		Father father=new Father();
		Son son = new Son();
		father=son;
		son=(Son) father;
		
		//예)
		//자바클래스의 최고 조상 : Object 클래스
		Object obj=new Integer(3);
		Integer inte=(Integer) obj;
		obj=new Father();
		
		
		
		
		
		
		
		
	}//main() end
}//class end
