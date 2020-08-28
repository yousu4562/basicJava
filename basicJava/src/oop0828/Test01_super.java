package oop0828;

class School{
	String name="학교";
	public School() {
		System.out.println("School()...");
	}
}// class end


class MiddleSchool extends School{
	String name="중학교";
	public MiddleSchool() {
		
		//상속관계에서 부모생성자함수 호출 명령어
		super(); // 생략 가능하다.
		
		System.out.println("MiddleSchool()...");
	}
}// class end


class HighSchool extends School{
	String name="고등학교";
	public HighSchool() {
		super();
		System.out.println("HighSchool()...");
	}
	public void disp() {
		String name="종로고등학교";
		System.out.println(name); 		//종로고등학교
		System.out.println(this.name);	//고등학교
		System.out.println(super.name); //학교
	}//disp() end
	
}//class end



public class Test01_super {
	public static void main(String[] args) {
		//부모, 조상 -> super
		//부모클래스 -> superclass
		//자식클래스 -> subclass
		
		//this		멤버변수(field)와 일반변수를 구분하기 위해
		//this()	자신의 생성자함수가 자신의 생성자함수를 호출할 때
		
		//super		자식클래스에서 부모클래스의 멤버변수에 접근할때
		//super()	자식클래스의 생성자 함수가 부모클래스의 생성자함수를 호출할 때
		
		
//------------------------------------------------------------------
		//상속관계에서 생성자함수 호출 순서
		//부모생성자가 먼저 호출되고 자신의 생성자 함수가 호출된다.
		
		//School()... -> MiddleSchool()...		
		MiddleSchool ms=new MiddleSchool();
		
		//School()... -> MiddleSchool()...
		HighSchool hs=new HighSchool();
		hs.disp();
		
	}//main() end
}//class end
