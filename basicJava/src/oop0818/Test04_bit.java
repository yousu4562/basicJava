package oop0818;

public class Test04_bit {
	public static void main(String[] args) {
		// bit 연산자
		
		System.out.println(16<<3); // 128
		System.out.println(16>>3); // 2
/*		
	컴퓨터 신호체계 : 0, 1
	컴퓨터 신호의 최소단위 : bit
	예) A -> 01000001
	최소의 저장 단위 -> 8bit -> 1byte
	컴퓨터 용량의 크기 : KB < MB < GB < TB < NB
	
	 [수의 체계]
	 2진수 0 1
	 8진수 0 1 2 3 4 5 6 7
	 10진수 0 1 2 3 4 5 6 7 8 9
	 16진수 0 1 2 3 4 5 6 7 8 9 A B C D E F
	 
	 5 ->       101
	 9 ->      1001
	 15 ->     1111
	 16 ->    10000
	 
	 문제) 10진수 16을 2진수로 바꾸시오
	 	 16 -> 00010000
	 	 <<3   10000000     128		left shift  
	 	 >>3   00000010	 	  2		right shift
	 	   ※ 3은 이동 bit수
 	  	
*/
		
		
		
	}// main() end
} // class end
