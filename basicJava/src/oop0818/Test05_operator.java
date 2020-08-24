package oop0818;

public class Test05_operator {

	public static void main(String[] args) {
		// 삼항연산자
		// -> (조건)  ?  참   : 거짓
		
		// 문제) 절대값을 구하시오.
		/*
		int num=-3;
		int result=(num<0) ? num*-1 : num;
		System.out.println(num + " 절대값: " + result);
		*/
		
//----------------------------------------------------
		
		// 대입연산자
		/*
		int a=3;
		
		a=a+2;
		System.out.println(a); //5
		
		a+=2;
		System.out.println(a); //7
		
		a=a-3;
		System.out.println(a); //4
		
		a-=3;
		System.out.println(a); //1
		
		a*=5;
		System.out.println(a); //5
		
		a/=3;
		System.out.println(a); //1
		
		a%=3;
		System.out.println(a); //1
		*/
//---------------------------------------------
		/*
		// 1증가 연산자
		int a=3;
		a=a+1;
		a+=1;
		a++;
		++a;
		System.out.println(a);
		
		// 1감소 연산자
		int b=3;
		b=b-1;
		b-=1;
		b--;
		--b;
		System.out.println(b);
		
		// 1증감연산자는 대입연산자와 계산식과
		// 함께 사용되는 경우 주의!!
		int i=10, j=20;
		int x=i++; 	// int x=i;
					// i=i+1;
		int y = --j;// j=j-1;
					// int y=j;
		System.out.println(i); //11
		System.out.println(j); //19
		System.out.println(x); //10
		System.out.println(y); //19
		*/
		// 증감연산자가 변수명 앞에 있을 경우에 먼저 실행, 뒤에있으면 나중에 실행
//----------------------------------------------------------		
		// 문제) 다음 계산 식을 분석하시오.
		int p=2, q=6;
		int r=++p * q--;
		/*
			p=p+1;    			// p = 3
			int r = p * q;		// r = 18
			q=q-1;				// q = 5
		  
		 */
		System.out.println(p);	//3
		System.out.println(q);	//5
		System.out.println(r);	//18
		
	}// main() end
}// class end
