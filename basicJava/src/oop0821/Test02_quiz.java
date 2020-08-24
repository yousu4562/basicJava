package oop0821;

public class Test02_quiz {
	public static void main(String[] args) {
		// 문자 배열 연습문제
		char[] ch= {'S','o','l','D','e','s','k'};
		int size=ch.length;
		
		// 문제 )대문자, 소문자의 갯수를 각각 구하고
		//		대소문자를 서로 바꿔서 출력하시오. 
		/* 출력결과
			대문자 : 2 개
			소문자 : 5 개
			sOLdESK
		*/
		/*
		int large = 0 ;
		int small = 0 ;
		for(int r=0; r<size; r++) {
			if(ch[r] >= 'A' && ch[r] <= 'Z') {
				large = large +1;
			}else {
				small = small +1;
			} // if end
		}// for end
		System.out.println("대문자 : " + large + "개");
		System.out.println("소문자 : " + small + "개");
		
		for(int r=0; r<size; r++) {
			if(ch[r] >= 'A' && ch[r] <= 'Z') {
				ch[r] = (char)(ch[r] + 32);
			}else {
				ch[r] = (char)(ch[r] - 32);
			} // if end
			System.out.print(ch[r]);
		} // for end
		*/
		// 풀이
		int upper=0; // 대문자의 갯수
		int lower=0; // 소문자의 갯수
		
		for(int i=0; i<size; i++) {
			if(ch[i] >= 'A' && ch[i] <= 'Z') {
				upper++;
				System.out.print((char)(ch[i]+32));
			}else if(ch[i] >= 'a' && ch[i] <= 'z') {
				lower++;
				System.out.print((char)(ch[i]-32));
			}// if end
		}// for end
		System.out.println();
		System.out.println("대문자 : " + upper + "개");
		System.out.println("소문자 : " + lower + "개");

		
		// 문제) 모음의 갯수를 구하시오.
		int mo =0;
		for(int i=0; i<size; i++) {
			switch(ch[i]) {
			case 'A': 
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': mo++;

			}// switch end
		}// for end
		System.out.println("모음의 갯수 : " + mo + "개");
		
		
		
		
		
	}// main() end
}// class end
