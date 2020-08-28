package oop0827;

class Korea{
	String name="대한민국";
	final void view() {
		System.out.println("Korea.view()...");
	}//view() end
	void disp() {
		System.out.println("Korea.disp()..."+name);
	}//disp() end
}//class end

class Seoul extends Korea{}//class end

class Busan extends Korea{
	String name="부산광역시";
	@Override
	void disp() {
		System.out.println("Busan.disp()...");
	}
/* 에러
  	final method는 더이상 오버라이드 할수 없다.
	
	@Override
	void view() {
	}
	
*/
}//class end
	
	
public class Test03_override {

	public static void main(String[] args) {
		//Method Override 함수 재정의
		//-> 상속관계에서 메소드를 다시 수정(리폼)
		
		//1)오버라이드 하기 전
		Seoul se=new Seoul();
		se.disp(); // 대한민국
		se.view();
		
		
		//2)오버라이드 한 후
		Busan bu=new Busan();
		System.out.println(bu.name); // 부산광역시
		bu.disp();
		bu.view();
	}//main() end
}//class end
