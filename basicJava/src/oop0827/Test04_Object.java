package oop0827;

class Jeju extends Object {
	// extends Object 생략가능
	@Override
	public String toString() {
		return "제주도";
	}
}//class end

class Suwon extends Object{
	private String id="SOLDESK";
	private String pw="1234";
	
	@Override
	public String toString() {
		return "Suwon [id = "+ id + ", pw = "+pw+"]";
	}
	//코딩시 멤버변수가 가지고 있는 값을
	//확인하기 위해 주로 사용한다.
}//class end

class Incheon extends Object{
	private String name="인천광역시";
	private String phone="5678";
	
	//source -> generate toString 으로 생성된 코딩
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", phone=" + phone + "]";
	}
	
	
}//class end

public class Test04_Object {
	public static void main(String[] args) {
		// Object클래스
		/*
			자바의 최고 조상 클래스 : Object 클래스
			자바의 기본패키지(jvav.lang)에 선언되어 있음
			자바의 모든 클래스는 무조건 Object클래스를 상속받는다.
			자바의 모든 클래스는 Object 클래스의 후손들이다.
		
		*/
		Jeju je=new Jeju();
		System.out.println(je.toString());
		//함수이름 생략가능
		System.out.println(je);
		
		Suwon su=new Suwon();
		System.out.println(su.toString());
		System.out.println(su);
		
		Incheon in=new Incheon();
		System.out.println(in.toString());
		System.out.println(in);
		
		
	}//main() end
}//class end
 