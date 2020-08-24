package oop0821;

public class Test03_quiz {
	public static void main(String[] args) {
		// 1차원 배열 연습문제
		
		int[] num= {7,8,-9,5,6};
		int size =num.length; //5
		
		// 문제) num 배열 요소중 음수의 갯수를 구하시오.
		
		/*
		int count=0;
		for(int i=0; i<size; i++) {
			if(num[i]<0) {
				count++; 
			}
		}
		System.out.println("음수의 갯수 : " + count + "개");
		*/
		
		// 풀이
		int count=0; 
		for(int i=0; i<size; i++) {
			if (num[i]<0) {
				count++;
			} // if end
		}// for end
		System.out.println("음수의 갯수 : " + count + "개");
		
		// 문제 ) 최대값, 최소값을 각각 구하시오.
		
		/*
		int max=0, min=0; // 수정 0->num[0]
		for (int i=0; i<size; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		
		for (int i=0; i<size; i++) {
			if(num[i] < min) {
				min=num[i];
			}
		}
		
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
		*/
		
		// 풀이
		int max=num[0]; // 최대값 데이터값이 모드 음수일 경우에 max=0이면 최대값은 0 오류
		int min=num[0]; // 최소값 위와 마찬가지로 모두 양수일 겨웅에 min= 0 이면 최소값은 0 오류
		
		for (int i=0; i<size; i++) {
			if(max<num[i] ){
				max=num[i];
			}// if end
			if(min>num[i]) {
				min=num[i];
			}// if end
		}
		
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
				
		// 문제 ) num[4]의 등수를 구하시오.
		/*
		int[] rank= {1,1,1,1,1};
		for (int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if (num[i]<num[j]) {
					rank[i]++;
				}
			}
			
		}
		System.out.println(num[4]+ "의 등수는" + rank[4] + "등");
		*/
		
		// 풀이
		int r=1;
		for(int i=0; i<size; i++) {
			if(num[4]<num[i]) {
				r++;
			}// if end
		}// for end
		System.out.println(num[4]+ "의 등수는" + r + "등");
		System.out.println();

		
		// 문제) num 배열의 각 요소의 등수를 구하시오.
		int[] rank= {1,1,1,1,1};
		for (int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {				
				if (num[i]<num[j]) {
					rank[i]=rank[i]+1;
				}//if end
			}// for end
		System.out.println(num[i]+ "의 등수는" + rank[i] + "등");	
		}// for end
		
	}// main() end
}// class end
