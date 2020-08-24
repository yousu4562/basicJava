package oop0819;

public class Test03_switch {

	public static void main(String[] args) {
		// switch ~ case 문
		// -> 목록중에서 동일한 값을 찾아서 수행
		// break : switch문을 빠져나옴
		/* switch(x){   ()안의 값과 같은 case를 실행
		 * case x: ~   ; break;    : 구문을 연결? ; 
		 * case x: ~   ; break;
		 * case x: ~   ; break;
		 * }
		 */
		/*
		switch(30) {
		case 10: System.out.println("SEOUL"); break;
		case 20: System.out.println("JEJU"); break;
		case 30: System.out.println("BUSAN"); break;
		}// switch end
		*/
		
		/*
		switch(40) {
		case 10: System.out.println("SEOUL"); break;
		case 20: System.out.println("JEJU"); break;
		case 30: System.out.println("BUSAN"); break;
		default: System.out.println("기타.."); break;	// default 조건에 맞지않는 값을 입력했을때 출력값
														// 예) switch(20) -> "JEJU"
														// 	  switch(40) -> "기타.."
		}// switch end
		*/
		
		/*
		// break문이 없으면 계속해서 switch안에서 수행한다.		
		switch(20) {
		case 10: System.out.println("SEOUL"); break;
		case 20: System.out.println("JEJU");
		case 30: System.out.println("BUSAN"); break;
		}// switch end
		// switch(20) -> case 20 : JEJU출력; -> case 30 : BUSAN 출력; -> break; 빠져나옴
		*/
//-------------------------------------------------------------------------------------------------		
		// 문제) 평균점수에 따라서 A, B, C, D, F학점을 출력하시오.
			int kor=90, eng=80, mat=80;
			int aver=(kor+eng+mat)/3;
			/*
			// 너무 비효율적
			switch(aver) {
			case 100: System.out.println("A"); break;
			case 99: System.out.println("A"); break;
			case 98: System.out.println("A"); break;
			case 97: System.out.println("A"); break;
			case 96: System.out.println("A"); break;
			case 95: System.out.println("A"); break;
			case 94: System.out.println("A"); break;
			case 93: System.out.println("A"); break;
			case 92: System.out.println("A"); break;
			case 91: System.out.println("A"); break;
			case 90: System.out.println("A"); break;
			case 89: System.out.println("B"); break;
			}// switch end 
			*/
			System.out.println("평균: "+aver+"점");
			switch(aver/10) {
			case 10 : System.out.println("학점: A"); break;
			case 9 : System.out.println("학점: A"); break;
			case 8 : System.out.println("학점: B"); break;
			case 7 : System.out.println("학점: C"); break;
			case 6 : System.out.println("학점: D"); break;
			default : System.out.println("학점: F"); break;
			}// switch end
		
//-------------------------------------------------------------
		// 문제) 연산기호(op)에 따라 결과값을 출력하시오.
		int i=5, j=3;
		char op='*';
		/* 출력결과
		  5+3=8
		  5-3=2
		  5*3=15
		  5/3=0.6
		  5%3=2
		*/
		int res1=0;	// 정수형 계산 결과값
		double res2=0.0; // 실수형 계산 결과값
		
		switch(op) {
		case '+' : res1=i+j; break;
		case '-' : res1=i-j; break;
		case '*' : res1=i*j; break;
		case '/' : res2=(double)i/j; break;
		case '%' : res1=i%j; break;
		}// switch end
		
		if (op=='/') {
			System.out.println(i+""+op+""+j+"="+res2);
		}else {
			System.out.println(i+""+op+""+j+"="+res1);
		}// if end
		
		/* 최대한 코드를 간단하게 해보자
		switch (op) {
		case '+' : System.out.println(i+""+op+""+j+"="+(i+j)); break;
		case '-' : System.out.println(i+""+op+""+j+"="+(i-j)); break;
		case '*' : System.out.println(i+""+op+""+j+"="+(i*j)); break;
		case '/' : System.out.println(i+""+op+""+j+"="+((double)i/j)); break;
		case '%' : System.out.println(i+""+op+""+j+"="+(i%j)); break;
		default : System.out.println("오류"); break;
		}
		*/
//--------------------------------------------------------------
		// 문제) 주민번호를 이용해서 나이와 성별을 출력하시오.
		// 나이 : 올해년도 - 태어난년도
		// 성별 : 1 또는 3 남자, 2 또는 4 여자
		//		성별코드가 1, 2 -> 1900년대 태생
		//				3, 4 -> 2000년대 태생
		int myYear=0; //year=2020; // 태어난 년도
		int myCode=3;  // 성별 코드
		
		// 태어난 년도 완성하기
		switch(myCode) {
		case 1: myYear=myYear+1900; break;
		case 2: myYear=myYear+1900; break;
		case 3: myYear=myYear+2000; break;
		case 4: myYear=myYear+2000; break;
		}// switch end
		
		// 나이
		int myAge=2020-myYear;
		System.out.println("나이: " + myAge+"세");
		
		// 성별
		String gender="";
		switch(myCode%2) {
		case 0 : gender="여자"; break;
		case 1 : gender="남자"; break;
		}// switch end
		
		System.out.println("성별: " + gender);
		
		
		/*
		switch(myCode) {
		case 1 : System.out.println("나이: "+ (year - (1900+myYear)) + "세"); 
				 System.out.println("성별: 남성"); break;
		case 2 : System.out.println("나이: "+ (year - (1900+myYear)) + "세");
		 		 System.out.println("성별: 여성"); break;
		case 3 : System.out.println("나이: "+ (year - (2000+myYear)) + "세");
		 		 System.out.println("성별: 남성"); break;
		case 4 : System.out.println("나이: "+ (year - (2000+myYear)) + "세");
		 		 System.out.println("성별: 여성"); break;
		}// switch end
		*/
		
	}// main() end

}// class end
