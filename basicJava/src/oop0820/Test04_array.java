package oop0820;

public class Test04_array {

	public static void main(String[] args) {
		/* Array 배열
		   -> 하나의 변수에 1개이상의 
		   -> 동일한 자료형의 값을 저장할수 있는 공간
		   -> 요소 element
		   -> 순서, 색인 index
		   -> 1차원 배열 : [열]
		   -> 2차원 배열 : [행] [열]
		   -> 3차원 배열 : 자바에는 없는 문법
		   -> 열, 칸, column
		   -> 행, 줄, row
		   -> /new 연산자 : 메모리 할당(확보) 연산자
		*/
		
		// 배열 선언
		// 4바이트*3개 = 12바이트 메모리 확보
		int[] kor=new int[3];
		kor[0]=10;
		kor[1]=20;
		kor[2]=30;
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		// 배열 요소의 갯수
		System.out.println(kor.length); // 3
		
//------------------------------------------------
		
		// 메모리 할당 및 초기값 저장
		int[] eng= {40, 50, 60};
		for (int i=0; i<eng.length; i=i+1) {
			System.out.println(eng[i]);
		}// for end
		
		// ArrayIndexOutOfBoundsException 발생
		// 3번째 요소는 없음.
		// System.out.println(eng[3]);
		
//------------------------------------------------

		double[] aver= {1.2, 3.4, 5.6};
		for(int i=0; i<aver.length; i++) {
			System.out.println(aver[i]);
		}// for end

//------------------------------------------------
		
		char[] ch = {'H','E', 'L', 'L', 'O'};
		for(int i=0; i<ch.length; i=i+1) {
			System.out.println(ch[i]);
		}// for end
		
//------------------------------------------------
		
		String[] name = {"진달래", "개나리", "무궁화"};
		for(int i=0; i<name.length; i=i+1) {
			System.out.println(name[i]);
		}// for end
		
//------------------------------------------------		
		
		// 문제) 배열 요소의 전체 합을 구하시오.
		int[] num = {3, 5, 7};
		// int hap = num[0]+num[1]+num[2];
		int hap=0;
		for(int i=0; i<num.length; i++) {
			hap=hap+num[i];
		} // for end	
		System.out.println(hap); // 15
		
		
		
		
		
		
	}// main() end

}// class end
