package oop0826;

public class Test06_String {

	public static void main(String[] args) {
		// 문자열 관련된 클래스
		// String 클래스
		// StringBuffer, StringBuilder
		// StringTokernizer 클래스
		
		// 문자열 연산 속도
		// String < StringBuffer < StringBuilder
		
//------------------------------------------
		/*
		String str="";
		System.out.println(str.length());
		str=str+"ONE";
		System.out.println(str);
		str=str+"TWO";
		System.out.println(str);
		str=str+"THREE";
		System.out.println(str);
		str="";		// 모든 문자열 지우기(빈 문자열 대입)
		System.out.println(str);
		*/
//--------------------------------------------
		/*
		StringBuilder sb=null; //메모리할당
		//NullPointerException발생
		//System.out.println(sb.length());
		
		sb=new StringBuilder(); //메모리할당
		sb.append("ONE");
		System.out.println(sb.toString());
		sb.append("TWO");
		System.out.println(sb.toString());
		sb.append("THREE");
		System.out.println(sb.toString());
		//모든글자 지우기
		sb.delete(0, sb.length());
		System.out.println(sb.length());
		*/
//----------------------------------------------
		
		String str="Gone With The Wind";
		/*
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(17));
		//length()이용해서 마지막 문자출력
		System.out.println(str.charAt(str.length()-1));
		
		
		// 문제) 대소문자를 서로 바꿔서 출력하시오
		//		Character 클래스 활용
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			}else if(Character.isLowerCase(c)) {
				System.out.print(Character.toUpperCase(c));
			}else {
				System.out.print(c);
			}//if end
		}
		System.out.println();
		
//--------------------------------------------------------
		
		// "G" 문자열의 순서 -> 0
		System.out.println(str.indexOf("G"));
		//중복되 있다면 맨처음 "e"문자열의 순서 -> 3
		System.out.println(str.indexOf("e"));
		//없는 문자열의 순서-> -1
		System.out.println(str.indexOf("k"));
		//'n' -> 'N'으로 치환
		System.out.println(str.replace('n', 'N'));
		
		
		//문자열의 갯수가 0인지
		if(str.isEmpty()) {
			System.out.println("빈 문자열이다.");
		}else {
			System.out.println("빈 문자열이 아니다.");
		}//if end
			
		//앞에서부터 문자열 비교
		System.out.println(str.startsWith("Gone"));
		//뒤에서부터 문자열 비교
		System.out.println(str.endsWith("Wind"));
		
		
		//문자열 내용 비교
		System.out.println("sky".equals("hi")); //false
		*/
		
		
//--------------------------------------------------------
		
		// 문자열 일부분만 추출 (★★★)

		//6번째 ~ 끝까지
		//ith The Wind
		System.out.println(str.substring(6));
		
		//6번째~ 11번째
		//ith Th
		System.out.println(str.substring(6, 12));
		
		//문제)"The" 추출하기
		System.out.println(str.substring(10,13));
		
		//문제)첫번째 문자 추출하기 -> "G"
		System.out.println(str.substring(0 ,1));
		
		//문제)마지막 문자 추출하기 -> "d"
		System.out.println(str.substring(str.length()-1, str.length()));
		
//----------------------------------------------------
		
		// 특정 문자를 기준으로 문자열 분리하기
		String[] word =str.split(" ");
		for(int i=0;i<word.length; i++) {
			System.out.println(word[i]);
		}// for end
		
		// 좌우 끝에 있는 공백 제거
		System.out.println("#"+"   s  ky ".trim()+"#");
		
	}//main() end
}//class
