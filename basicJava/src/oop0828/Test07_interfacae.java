package oop0828;

class Unit{
	int currentHP;
	int x,y;
}//class end

interface Movable{
	void move(int x, int y); 
}//interface end

interface Attackable{
	void attack(Unit u);
}//interface end

interface Fightable extends Movable, Attackable{
	//인터페이스간의 상속은 다중 상속이 가능하다.
}//interface end

class Fight extends Unit
			implements Fightable{
	//클래스간의 상속은 단일 상속만 가능하다
	@Override
	public void move(int x, int y) {}

	@Override
	public void attack(Unit u) {}

}//class end

class Tetris extends Unit
			 implements Movable, Attackable{
	//다중 구현이 가능하다.
	@Override
	public void attack(Unit u) {}

	@Override
	public void move(int x, int y) {}
	
}//class end


public class Test07_interfacae {
	public static void main(String[] args) {
		//클래스와 인터페이스의 상속
		
		
		
	}//main() end
}//class end
