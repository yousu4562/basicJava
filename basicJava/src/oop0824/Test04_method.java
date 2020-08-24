package oop0824;

import java.util.Arrays;

public class Test04_method {
	
	public static void test1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	} // test1() end
	
	
	public static void test2(int[] a) {
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}// for end
	} // test2() end
	
	public static void test3(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}// test3() end
	
	public static void test4(String[] a) {
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}// for end
	}// test4() end
	
	public static void test5(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}//test5() end
	
	public static void test6(int[][] a) {
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}// for end
		}// for end
	}// test6() end
	
	public static void main(String[] args) {

		// 전달값이 배열인 경우
		int[] num = {10, 20, 30};
		
		// Call by value 값에 의한 호출 방식		
		test1(num[0], num[2]); // 10, 30
		
		System.out.println();
		// Call by reference 주소값에 의한 호출 방식
		test2(num); // 배열요소전체
					// 배열이 저장되어 있는 주소값
		
		System.out.println();
		String[] name= {"무궁화", "진달래", "개나리"};
		test3(name[0], name[2]); // 무궁화 개나리
		
		System.out.println();
		test4(name);
		
		System.out.println();
		// 1차원 배열을 전달하면 오름차순으로 정렬 해주는 함수
		int[] lotto= {3, 7, 4, 28, 13, 15};
		Arrays.sort(lotto);
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}// for end
		
//----------------------------------------------
		
		System.out.println();
		int[][] su= {
						{1,3,5},
						{2,4,6}
					}; // [2행][3열]
		
		test5(su[0][0], su[1][1]); // 1, 4
		
		System.out.println();
		test6(su);
		
	}// main() end
}// class end
