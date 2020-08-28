package oop0828;

interface Animal2{
	//void disp() {} 에러, 일반메소드 사용불가
	abstract void kind();	//추상메소드
	void breathe();			//abstract 생략가능 
							//interface 자체가 추상메소드만 가능하기 떄문
	
}//interface end

//상속
//클래스 입장에서 부모가 클래스 	: extends 확장
//클래스 입장에서 부모가 인터페이스 : implements 구현

class Elphant2 implements Animal2{

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breathe() {
		System.out.println("허파");
	}
	
}//class end

class Tuna2 implements Animal2{

	@Override
	public void kind() {
		System.out.println("어류");
	}

	@Override
	public void breathe() {
		System.out.println("아가미");
	}
	
}//class end


public class Test06_interface {
	public static void main(String[] args) {
		// 인터페이스 interface
		//->추상메소드로만 구성되어 있다.
		//->추상클래스보다 더 추상화 되어있다.
		
		//상속
		//->확장 extends
		//->구현 implements
		
//----------------------------------------------------
		
		//인터페이스는 자신으로 직접 객체 생성 불가능
		//Animal2 ani=new Animal2(); 에러
		
		//인터페이스에서의 다형성
		Animal2 ani=new Elphant2();
		ani.kind();
		ani.breathe();
		
		ani=new Tuna2();
		ani.kind();
		ani.breathe();
		
		
		
		
		
		

		
	}//main() end
}//class end
