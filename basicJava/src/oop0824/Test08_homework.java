package oop0824;

public class Test08_homework {
	public static double sd(int[] aver) {
	
		double sum = 0.0; // aver[]의 합 변수
		
		for(int i=0; i<aver.length; i++) {
			sum=sum+aver[i];
		}// for end
		
		double avg = sum/aver.length; // aver[]의 평균 변수
		
		double[] d = new double[aver.length]; // 편차 변수 설정
		
		for(int i=0; i<aver.length; i++) {
			d[i] = Math.abs(aver[i]-avg);
		}// for end
		
		double sumd = 0;
		double sd = 0;
		
		for(int i=0; i<d.length; i++) {
			sumd=sumd+d[i];
		}// for end
		
		sd = sumd/d.length;
		
		return sd;
	}// sd end
	public static void main(String[] args) {
		// 표준편차 구하기
		int[] aver = {85, 90, 93, 86, 82};
		double result =sd(aver); //sd 함수 만들기
		
		System.out.println("aver[] 의 표준편차 :" +  result);
		/* 
		 	aver의 평균 (87.2)을 구하고
		 	
		 	85-87.2 = -2.2
		 	90-87.2 = 2.8
		 	93-87.2 = 5.8
		 	86-87.2 = -1.2
		 	82-87.2 = -5.2
		 	
		 	평균(87.2)과 차이값을 전부 양수로 바꾼다.
		 	-> 편차
		 	2.2
		 	2.8
		 	5.8
		 	1.2
		 	5.2
		 	
		 	표준편차 : 편차의 평균 sd()
		 */
	}

}
