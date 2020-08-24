package oop0821;

import java.util.Arrays;

public class Test06_lotto {

	public static void main(String[] args) {
		// 문제) 로또번호
		// 		1~45중에서 서로 겹치지 않게 6개 발생
		int[] lotto=new int[6];
		int size=lotto.length;
		for(int i=0; i<size; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for (int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}// if end
			}// for end
		}// for end
				
		
		
		// 정렬하기
		Arrays.sort(lotto);
		
		for(int i=0; i<size; i++) {
			System.out.println(lotto[i]);
		}
		
		
	}//main() end
}// class end
