package oop0825;

public class Test04_ox {
	public static void main(String[] args) {
		// [예제] 성적프로그램 OX 표시하기
		// 클래스명 : Jumsu
		
		// 한사람 대상으로 성적 구하기
		/*
		Jumsu student = new Jumsu(1, "홍길동", 3, 2, 3, 3, 3);
		student.compute();
		student.disp();
		*/
		
//----------------------------------------------------
		
		// 5명의 성적을 출력하시오.
		Jumsu[] student = {
				new Jumsu(1, "홍길동", 3, 2, 3, 3, 3),
				new Jumsu(2, "무궁화", 3, 3, 3, 3, 3),
				new Jumsu(3, "라일락", 1, 4, 2, 4, 3),
				new Jumsu(4, "진달래", 2, 3, 1, 3, 3),
				new Jumsu(5, "봉선화", 3, 3, 4, 4, 1)
		};
		
		
		// 1) ox와 점수 계산하기
			for(int i=0; i<5; i++) {
				student[i].compute();
			}
		// 2) 등수 구하기 (score 기준)
			int size=student.length;
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(student[i].score<student[j].score) {
						student[i].rank++;
					} // if end
				}// for end
			}// for end
			
		// 3) 출력하기
			for(int i=0; i<5; i++) {
				student[i].disp();
			}// for end
			

	}//main() end
}//class end
