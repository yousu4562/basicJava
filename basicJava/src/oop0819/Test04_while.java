package oop0819;

public class Test04_while {

	public static void main(String[] args) {
		// 반복문
		// while (조건) {조건이 true이면 수행}
		// while (true) {} -> 무한LOOP
		int a=1;
		while(a<=3) {
			System.out.println("JAVA");
			a=a+1;
		}// while end
		/*
		while(1<=3) {JAVA a=1+1}		JAVA
		while(2<=3) {JAVA a=2+1}		JAVA
		while(3<=3) {JAVA a=3+1}		JAVA
		while(4<=3) 
		*/
		
		int b=1;
		while(true) {
			System.out.println("Python");
			if(b==3) {
				break;
			}
			b=b+1; // b=+1 b++ ++b
		}// while end

//---------------------------------------------
		//do~while
		/*
			/do {
				조건이 true이면 수행
			}while(조건);
		*/
	
		int c=1;
		do {
			System.out.println("KOREA");
			c=c+1;
		}while (c<=3);
		/*
		do {KOREA c=1+1} while (2<=3)
		do {KOREA c=2+1} while (3<=3)
		do {KOREA c=3+1} while (4<=3)
		*/
		
		
		int d=3;
		do {
			System.out.println("SEOUL");
			d++;
		}while (d<=1);
		// 조건이랑 상관없이 처음 한번은 do {}를 수행한다.
		
	}// main() end

}// class end
