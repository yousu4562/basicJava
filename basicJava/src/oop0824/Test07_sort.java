package oop0824;

public class Test07_sort {
	public static void main(String[] args) {
		// sort 정렬
		// -> 특정한 키(Key field)를 기준으로 순서대로 재배치
		
		/*
			1) 정렬의 유형
			-> 오름차순 정렬, ascending  ASC  1 -> 10  A->Z  a->z  ㄱ->ㅎ
			-> 내림차순 정렬, descending DESC 10 -> 1  Z->A  z->a  ㅎ->ㄱ
			
			2) 정렬의 방법
			-> 삽입 정렬 (insertion sort)
			-> 선택정렬 (selection sort)
			-> 버블정렬 (bubble sort)
		*/
		
//-----------------------------------------------------------------
		int[] num= {9,7,5,3,1};
		
		// selection sort 알고리즘을 이용해서
		// 오름차순으로 정렬후 출력하시오.
		for(int a=0; a<num.length-1; a++) {
			for(int b=a+1; b<num.length; b++) {
				if(num[a]>num[b]) {
					int tmp=num[a];
					num[a]=num[b];
					num[b]=tmp;
				}// swap if end
			}// for end
		}// for end
		/*	
		 	분석)
		 	1회차
		 	a=0 -> b = 0+1 -> num[0] //9 > num[1] //7 ? true ->
		 	
		 	tmp = 9 -> num[0] = 7 -> num[1] = 9 ->
		 	
		 	b=1+1 -> 2<5 ? true ->
		 	num[0] //7 > num[2] //5 ? true ->
		 	tmp = 7 -> num[0] =5 -> num[2] = 7 ->
		 	
		 	b=2+1 -> 3<5 ? true ->
		 	num[0] // 5 > num[3] //3 ? true ->
		 	tmp = 5 -> num[0] = 3 -> num[3] = 5 ->
		 	
		 	b=3+1 -> 4<5 ? true ->
		 	num[0] //3 > num[4] //1 ? true ->
		 	tmp = 3 -> num[0] = 1 -> num[4] = 3->
		 	
		 	b=4+1 -> 5<5 ? false -> a=0+1 -> 1<4? true ->
		 	// num = {1, 9, 7, 5, 3}
		 	// 2회차
		 
		 	b= 1+1 -> 2<5? true ->
		 	num[1] // 9 > num[2] // 7 ? true ->
		 	tmp = 9 -> num[1] = 7 -> num[2] =9 ->
		 	
		 	b= 2+1 -> 3<5? true ->
		 	num[1] // 7 > num[3] //5 ? true ->
		 	tmp=7 -> num[1] = 5 -> num[3] =7 -> 
		 	...  
		 	
		 	// num = {1, 3, 9, 7, 5}
		 	
		 	// 3회차 시작
		 	a=2 -> ... num = {1, 3, 5, 9, 7}
		 	
		 	// 4회차 시작
		 	a=3 -> ... num = {1, 3, 5, 7, 9}
		 	
		 	a=4 -> 4<4? false -> 종료
		 	num = {1,3,5,7,9}
		 	
		*/
		
		// 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "  ");
		}// for end
		System.out.println();
		
//----------------------------------------------------------------
		int [] numb= {5,7,1,3,9};
		
		// bubble sort 알고리즘을 이용해서
		// 내림차순으로 정렬후 출력하시오. 
		for(int a=numb.length-2 ; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				if(numb[b] < numb[b+1]) { // 내림차순
					int tmp = numb [b+1];
					numb[b+1]=numb[b];
					numb[b]=tmp;
				}//swap
			}// for end
		}// for end
		/*
			분석)
			a=3 >= b=0? true -> 5<7? true ->
			(5 7) 1 3 9 -> 7 5 1 3 9 -> b=1 ->
			
			3 >= 1? true -> 7 < 1? false -> b=2 ->
			
			3>=2? true -> 1 < 3? true ->
			7 5 (1 3) 9 swap -> 7 5 3 1 9 -> b=3 ->
			
			3>=3? true -> 1 < 9? true ->
			7 5 3 (1 9) swap -> 7 5 3 9 1 -> b=4 ->
			
			3>=4? false -> a=2 -> 2>=0? true -> b=0 ->
			
			7<5? false -> b=1 ->
			1<=2? true -> 5<3? false -> b=2 ->
			2<=2? true -> 3<9? true -> 7 5 (3 9) 1 swap -> 7 5 9 3 1 -> b=3 ->
			3<=2? false -> a=1 -> 1>=0? true ->
			
			b=0 -> 7<5? false -> b=1 ->
			1<=1? true -> 5<9? true ->
			7 (5 9) 3 1 swap -> 7 9 5 3 1 -> b=2 -> 
			2<=1? false -> a=0 -> 0>=0? true ->
			
			b=0 -> 7<9? true ->
			(7 9) 5 3 1 swap -> 9 7 5 3 1 -> b=1 ->
			1<=0? false -> a=-1 -> -1>=0? false -> 종료
			
			numb = {9, 7, 5, 3, 1}	
					
		*/
		// 출력
		for(int i=0; i<numb.length; i++) {
			System.out.print(numb[i] + "  ");
		}// for end
		System.out.println();
		
	}// main() end
}// class end
