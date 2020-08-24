package oop0820;

public class Test02_quiz {

	public static void main(String[] args) {
		// 반복문 관련 문제
		System.out.println("문제 1)");
		// 문제) 알파벳을 한줄에 5개씩 출력하시오.
		
		/*  출력결과
			ABCDE
			FGHIJ
			KLMNO
			PORST
			UVWXY
			Z
		*/
		
		/*
		// OR
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			if (ch=='E' || ch=='J' || ch=='O' || ch=='T' || ch=='Y') {
				System.out.println(); // 줄바꿈
			}
			
		}// for end
		System.out.println("");
		
		// switch
		int count=1;
		for(char ch='A'; ch<='Z'; ch++) {
			switch (count%5) {
			case 0: System.out.println(ch); break;
			default: System.out.print(ch); break;
			} //switch end
			count = count + 1;
		}// for end
		System.out.println("");
		*/
		
		// 풀이
		int count=0;
		for(char ch='A'; ch<='Z'; ch++) {
			count=count+1;
			System.out.print(ch);
			//System.out.print(count);
			if(count%5==0) {
				System.out.println();
			}
		}// for end
//------------------------------------------------------------------
		System.out.println();
		System.out.println("문제 2)");
		// 문제) 누적의 합을 구하시오
		/*	출력결과
			1+....+10 = 55
			1+....+20 = 210
			1+....+30 = 
		
			1+....+90 =	
			1+....+100 = 5050 
		*/
		
		/*
		int hap = 0;
		// 누적의 합을 구하는 공식
		for(int a=10; a<=100; a=a+10) {
			for(int b=1; b<=a; b=b+1) {
				hap = hap + b;
			}
			System.out.println("1+....+"+a + "=" + hap);
			hap=0;
		}
		*/
		
		// 풀이
		int hap=0;
		for(int a=10; a<=100; a=a+10) {
			
			for(int b=1; b<=a; b=b+1) {
				hap=hap+b;
			}
			System.out.println("1+...+" + a+ "=" +hap);
			/*
				a=10
						b=1 ->		...	 -> b=10	b=11 ->false				
						0=0+1->     ...  -> 45=45+10
						hap=55 출력
				a=20
						b=1 -> 		...	 -> b=10    b=11 -> false
						55=55+1 // 오류 쓰레기값 출력이후 hap 변수 리셋 필요
			*/
			hap=0; // hap 변수의 값 초기화
		} // for end
		
		
		
//--------------------------------------------------------------------
		System.out.println("문제 3)");
		// 문제) 아래와 같이 출력하시오. 
		/*
			@★★★
			★@★★
			★★@★
			★★★@
		*/
		
		/*
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=4; b++) {
				if (b==a) {
					System.out.print("@");
				}else {
					System.out.print("★");
				}//if end
			}//for end
			System.out.println();
		}//for end
		*/
		
		// 풀이
		for(int a=1; a<=4; a=a+1) {
			for(int b=1; b<=4; b=b+1) {
				if(a==b) {
					System.out.print("@");
				}else {
					System.out.print("★");
				}//if end
			}//for end
			System.out.println();
		}//for end
		
		
		
//---------------------------------------------------------------------
		
		System.out.println("문제 4)");
		// 문제) 2g, 3g, 5g 짜리 추가 각각 5개씩 있다.
		// 		세가지의 추의 조합으로 무게가 40~45가
		//		각 추의 갯수와 무게를 출력하는 프로그램
		/*		출력결과
		  		2g	3g	5g	total
		  		 1	 5	 5	   42
		  		 2	 4 	 5	   41			
		 		 2	 5	 5	   44
		 */
		
		/*
		int x=0 , y=0, z=0, total=0;
		System.out.println("2g 3g 5g  total");
		for(x=0; x<=5; x++) {
			for(y=0; y<=5; y++) {
				for(z=0; z<=5; z++) {
					total=(x*2)+(y*3)+(z*5);					
					if (total>=40 && total <=45) {
						System.out.println(" "+x+"  "+y+"  "+z+"     "+ total);
					}
				}
			}
		}
		*/
		
		
		// 풀이 각 추의 갯수가 1개이상은 들어가야된다?
		System.out.println("   2g 3g 5g  total");
		int total=0, x=0;
		for(int a=1; a<=5; a=a+1) {
			for(int b=1; b<=5; b=b+1) {
				for(int c=1; c<=5; c=c+1) {
					total=(a*2)+(b*3)+(c*5);
					if(total >= 40 && total <= 45) {
						x=x+1;
						if(x<=9) {
							System.out.println(x + "   "+a+"  "+b+"  "+c+"     "+ total);	
						}else {
							System.out.println(x + "  "+a+"  "+b+"  "+c+"     "+ total);
						}
						
					}
				} //for end
			}// for end
		}// for end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main() end

}// class end
