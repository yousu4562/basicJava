package oop0827;

//종단 클래스는 상속받을수 없다.
//final class AA{}

class AA{
	private void zero() {}
	public void one() {
		System.out.println("AA.one()...");
	}
	public void two() {
		System.out.println("AA.two()...");
	}
}//class end


class BB extends AA{	// 부모클래스 AA
						// 자식클래스 BB
	public void three() {
		System.out.println("BB.three()...");
	}	
}//class end

class CC extends BB{	// 부모클래스 BB
						// 자식클래스 CC
	public void four() {
		System.out.println("CC.four()...");
	}
}//class end

class DD {}
/* 에러
	클래스는 단일상속만 가능하다
class EE extends AA, DD{}
*/


public class Test02_sangsok {
	public static void main(String[] args) {
		//상속 Inheritance
		//-> 재활용
		//-> 부모와 자식, 조상과 후손(파생), super와 sub
		//-> extends   확장
		//->implements 구현
		//형식) 자식 extends 부모{}
		
		AA aa=new AA();
		aa.one();
		aa.two();
		//aa.zero(); private속성은 클래스 내부에서만 접근 가능
		System.out.println("--------------------");
		
		BB bb=new BB();
		bb.three();
		bb.one();
		bb.two();
		// bb.zero(); private속성은 상속되지 않는다.
		System.out.println("--------------------");
		
		CC cc=new CC();
		cc.four();
		cc.three();
		cc.one();
		cc.two();
		System.out.println("--------------------");
	}//main() end
}//class end
