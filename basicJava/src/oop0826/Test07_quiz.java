package oop0826;

public class Test07_quiz {

	public static void main(String[] args) {
		// 문자열 관련 연습문제
		// 문제 1) 이메일 주소에 @문자 있으면
		//		@글자 기준으로 문자열을 분리해서 출력하고
		//		->출력결과
		//		@문자 없다면 "이메일 주소 틀림" 메세지를 출력하시오.  
		String email = "webmaster@soldesk.com";
		
		
		String[] word = email.split("@");
		for(int i=0; i<word.length; i++) {
			if(word.length==1) {
				System.out.println("이메일 주소 틀림");
			}else {
				System.out.println(word[i]);
			}
		}
		
		
//-----------------------------------------------		
		
		// 문제 2)주민번호 각 숫자의 전체 합을 구하시오.
		//	   1+5+1+2+3+0+4+1+2+3+4+5+6=?
		//substring()와 charAt()를 이용해서 각각 구하시오.
		
		String jumin = "1512304123456";
		int hap=0;
		for(int i=0; i<jumin.length(); i++) {
			char c=jumin.charAt(i);
			hap=hap+c;
		}
		System.out.println(hap);
		
		/*
		for(int i=0; i<jumin.length(); i++) {
			sum=sum+jumin.substring(i, i+1);
		}
		System.out.println(sum);
		*/
		
		
		
//-----------------------------------------------

		//문제 3-1) 파일명, 확장명을 분리해서 출력하시오.
		String path="d:/java0812/workspace/2020.03.10.sky.png";
		//출력결과
		//->파일명 : 2020.03.10.sky 
		//->확장명 : png
		
		//문제 3-2) 확장명이 이미지파일(jpg, png, gif)인 경우
		//		     맞으면 "파일이 전송되었습니다"
		//		     아니면 "파일을 다시 선택해 주세요" 출력
		
		
	}//main() end
}//class end
