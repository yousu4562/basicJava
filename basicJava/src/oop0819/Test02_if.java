package oop0819;

public class Test02_if {

	public static void main(String[] args) {
		// 성적 프로그램
		String name="코로나";
		int kor=65, eng=95, mat=60;
		
		// 평균 구하기
		int aver = (kor+eng+mat)/3;
		
		//출력
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+mat);
		System.out.println("평균: "+aver);
		
		// 문제) 평균이 95점 이상이면 장학생
		
		if (aver>=95) {
			System.out.println("장학생");
		}// if end
		
		// 문제) 국어 점수가 70점 이상이면 "합격"
		//		아니면 "불합격"
		
		if (kor>=70) {
			System.out.println("국어: 합격");
		}else {
			System.out.println("국어: 불합격");
		}// if end
		
		// 문제) 수학점수가 90점 이상이면 "A"
		// 				80점 이상이면 "B"
		//				70점 이상이면 "C"
		// 				60점 이상이면 "D"
		//				나머지 "F"
		
		if (mat>=90) {
			System.out.println("수학: A");
		}else if (mat>=80) {
			System.out.println("수학: B");
		}else if (mat>=70) {
			System.out.println("수학: C");
		}else if (mat>=60) {
			System.out.println("수학: D");
		}else {
			System.out.println("수학: F");
		}// if end
		
		// 문제) 문제) 과락
		//     		평균이 70점이상이면 결과:합격
		//       	(단, 국영수 세과목 중에서 한과목이라도
		//       	40점미만이면 결과:재시험)
		//       	평균이 70점미만이면 결과:불합격
		if (aver>=70) {
			// 1) OR 조건
			if (kor < 40 || eng < 40 || mat < 40) {
				System.out.println("OR결과: 재시험");
			}else {
				System.out.println("OR결과: 합격");
			}
		}else {
			System.out.println("OR결과: 불합격");
		} // if end
		
		if (aver>=70) {
			// 2) AND 조건
			if (kor>=40 && eng>=40 && mat>=40) {
				System.out.println("AND결과: 합격");
			}else {
				System.out.println("AND결과: 재시험");
			}
		}else {
			System.out.println("AND결과: 불합격");
		} // if end
		
		
	}// main() end

}// class end
