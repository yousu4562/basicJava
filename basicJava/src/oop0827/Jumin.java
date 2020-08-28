package oop0827;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jumin {
	private String jumin;	//주민번호
	public Jumin() {}
	public Jumin(String jumin) {
		this.jumin=jumin;	
	}//Jumin() end
	
	public boolean validate() {
		//주민번호 유효한지 검증
		boolean flag=false;
		int[] vali=new int[jumin.length()];
		
		//주민번호 13자리가 아닐경우
		if(jumin.length()!=13) {
			return flag;
		} // if end
		
		// 주민번호 int형 배열로 변환
		for(int i=0; i<jumin.length(); i++) {
	    	vali[i]=Integer.parseInt(jumin.substring(i, i+1));
		}//for end
		
		int sum=0;
		
		// 오류검증번호 배열
		int[] gop= {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		// 오류검증
		for(int i=0; i<gop.length; i++) {
			sum=sum+(vali[i]*gop[i]);
		}//for end
		
		if(vali[12]==(11-(sum%11))%10){
			flag=true;
		}//if end
		
		return flag;
		
	}//validate() end
	
	public void disp() {
		int[] vali=new int[jumin.length()];
		for(int i=0; i<jumin.length(); i++) {
	    	vali[i]=Integer.parseInt(jumin.substring(i, i+1));
		}
		int year=0;
		int month=vali[2]*10+vali[3];
		int date=vali[4]*10+vali[5];
		//생년월일, 성별, 나이, 띠 출력하기
		
		//생년월일 : 1992년 4월 6일
		if(vali[6]==1 || vali[6] ==2) {
			year=1900+vali[0]*10+vali[1];
		}else {
			year=2000+vali[0]*10+vali[1];
		}
		System.out.println("생년월일 : "+year+"년 "+ month+ "월 "+date+"일");
		
		//성별 : 남자
		if(vali[6]==1 || vali[6]==3) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}

		//나이 : 29
		//-> GregorianCalendar 클래스 이용
		GregorianCalendar now=new GregorianCalendar();
		System.out.println("나이 : " + (now.get(Calendar.YEAR)+1-year)+ "세");

		//띠 : 
		//-> 태어난년도%12
		//->0원숭이 ~~~~11양
		String[] a= {"원숭이", "닭", "개", "돼지","쥐","소",
				"호랑이","토끼","용","뱀","말", "양"};
		System.out.println("띠 : " + a[year%12] + "띠");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//disp() end
	
	
	
	
	
}//class end
