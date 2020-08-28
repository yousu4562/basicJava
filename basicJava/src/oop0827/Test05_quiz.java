package oop0827;

public class Test05_quiz {

	public static void main(String[] args) {
		//연습문제)
		//주민번호 유효성 검사 후
		//생년월일, 성별, 나이, 띠 출력하기
		Jumin id = new Jumin("9204061030218");
		if(id.validate()) {
			System.out.println("주민번호 맞다.");
			id.disp();
		}else {
			System.out.println("주민번호 틀리다.");
		}//if end
		
		
		
		
		
		
		
		
	}//main() end
}//class end
