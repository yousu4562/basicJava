package oop0828;

class Parent{
	int one, two;
	public Parent() {}
	public Parent(int one, int two) {
		this.one = one;
		this.two = two;
	}
}//class end

class Child extends Parent{
	int three;
	public Child() {
		super();
	}
	public Child(int a, int b, int c) {
		//1)one, two멤버변수가 private 속성이면 에러발생
		//super.one=a;
		//super.two=b;
		
		//2)상속받은 멤버변수(one,two)에 변수전달
		super(a,b);
		this.three=c;
	}
}//class end


public class Test02_super {
	public static void main(String[] args) {
		
		Child child = new Child(10,20,30);
		System.out.println(child.one);
		System.out.println(child.two);
		System.out.println(child.three);
		
	}//main() end
}//class end
