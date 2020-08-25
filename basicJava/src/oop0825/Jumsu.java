package oop0825;

public class Jumsu {
		
	// 멤버변수 field
		private int no;					//번호
		private String name;			//이름
		private char[] ox=new char[5];	//OX표시
		private int[] answer=new int[5];//답안제출
		public int score=0;				//점수
		public int rank;				//등수
		
		// 생성자 함수 Constructor
		public Jumsu() {}
		public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
			this.no=no;
			this.name=name;
			this.answer[0]=a0;
			this.answer[1]=a1;
			this.answer[2]=a2;
			this.answer[3]=a3;
			this.answer[4]=a4;
			this.rank=1;
	}// end
		
	// 멤버함수
	public void compute() {
		// 정답
		int[] dap= {3,3,3,3,3};
		
		// 정답과 제출한 answer답안을 비교해서
		// OX를 구하고 맞은 갯수에 따라 점수를 구하시오.
		for(int i=0; i<dap.length; i++) {
			if(dap[i]==answer[i]) {
				ox[i]='O';
				score=score+20;
			}else {
				ox[i]='X';
			}// if end
		}// for end
		
		
	}//compute() end
	
	public void disp() {// 출력하기
		System.out.print(no + " ");
		System.out.print(name + "  ");
		for(int i=0; i<5; i++) {
			System.out.print(ox[i] + "  ");
		}
		System.out.print(score + "  ");
		System.out.print(rank + "  ");
		System.out.println();
	}//disp() end
		
		
	
}// class end
