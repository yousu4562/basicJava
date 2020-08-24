package oop0821;

public class Test01_array {

	public static void main(String[] args) {
		// 2차원 배열
		// [행][열]
		
		// 2행 3열 
		// 4바이트가 6개 -> 24바이트 메모리 할당
		
		/*
		int[][] kor=new int [2][3];
		kor[0][0] = 10;
		kor[0][1] = 20;
		kor[0][2] = 30;
		kor[1][0] = 40;
		kor[1][1] = 50;
		kor[1][2] = 60;
		
		// kor 배열의 행의 갯수 
		System.out.println(kor.length); // 2
		// kor[0] 행의 열의 갯수
		System.out.println(kor[0].length); // 3
		// kor[1] 행의 열의 갯수
		System.out.println(kor[1].length); // 3

		for (int r=0; r<=1; r++) {
			for(int c=0; c<=2; c++) {
				System.out.println(kor[r][c]);
			}
		}
		*/
//--------------------------------------------------
		/*
		int[][] kor = {
				 {10,20,30}
				,{40,50,60}
		}; // 2행 3열
		
		int row=kor.length; // 2
		
		for(int r=0; r<row; r++) {
			int col=kor[r].length;
			for (int c=0; c<col; c++) {
				System.out.println(kor[r][c]);
			}// for end
		}// for end
		*/
//----------------------------------------------------
		// 2차원 배열에서 각행의 열의 갯수는 달라도 된다.
		int[][] kor = {
				{10,20},
				{30,40,50,60},
				{70,80,90,}
		};
		
		int row = kor.length;
		System.out.println(row); //3 
		
		for(int r=0; r<row; r++) {
			int col=kor[r].length;
			for(int c=0; c<col; c++) {
				System.out.println(kor[r][c]);
			}// for end
		}// for end
		
		// java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(kor[4][4]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main() end

}// class end
